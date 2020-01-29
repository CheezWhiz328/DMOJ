#include <iostream>
#include <set>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    set<string> set1;
    
    int n;
    cin >> n;
    for(int i=0; i<n; i++){
       vector<string> arr;
        for(int j=0; j<6; j++){
            string a;
            cin >> a;
            arr.push_back(a);
            
        }
        
        vector<string> s;
         
        for(int j=0; j<2; j++){
            for(int k=0; k<6; k++){
                string str = "";
                for(int l=0; l<6; l++){
                    if (j == 1) {
						str += arr[5 - (l + k) % 6];
					} else {
						str += arr[(l + k) % 6];
					}
                }
                
                s.push_back(str);
            }
        }
        
        sort(s.begin(), s.end());
        
        string str = "";
        for(int j=0; j<12; j++){
            str+=s[j];
        }
        
        if(set1.find(str)!=set1.end()){
            cout << "Twin snowflakes found.\n";
            return 0;
        }
        
        set1.insert(str);
        
    }
    
    cout << "No two snowflakes are alike.\n";
    
    return 0;
}