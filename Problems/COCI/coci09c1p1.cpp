#include <bits/stdc++.h>

using namespace std;

int main() {
    int arr[8] = {0};
    for(int i=0; i<8; i++){
        cin >> arr[i];
    }bool a = true;
    for(int i=0; i<8; i++){
        if(arr[i]!=8-i){
            a = false;
        }
    }if(a){
        cout << "descending";
        return 0;
    }
    
    a = true;
    for(int i=0; i<8; i++){
        if(arr[i]!=i+1){
            a = false;
        }
    }if(a){
        cout << "ascending";
    }else{
        cout << "mixed";
    }
    return 0;
}
