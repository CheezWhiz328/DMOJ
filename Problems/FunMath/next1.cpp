#include <iostream>

using namespace std;

int main()
{
    int N, a;
    cin >> N;
	for(int i=0; i<N; i++) {
		cin >> a;
		while(true) {
			a++;
			int b = a;
			int count = 0;
			if(b%2==0) {
				while(b%2==0) {
					b = b/2;
					count++;
					if(count>2) {
						break;
					}
				}
			}
				
			for (int j = 3;count<2 && j*j <= b; j += 2) {
				if (b % j == 0) {
					while(b%j==0) {
						b /= j;
						count++;
					}
				}
			}if(b>1) {
				count++;
			}
			if(count==2) {
				cout <<a<<endl;
				break;
			}
		}
	}

    return 0;
}
