#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int arr[n] = {0};
    for(int i=0; i<n; i++){
        cin >> arr[i];
    }
    int count = 0;
    for(int i=0; i<n; i++){
        int ans = arr[i]*(i+1);
        int x = ans - count;
        cout <<(ans - count)<< " ";
        count += x;
        
    }

    return 0;
}
