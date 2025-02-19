#include<iostream>
using namespace std;


int main(){

    int n;
	cin>>n;
	// taking input from user

	// print square that have n value in every cell
	for(int row =1; row<=n; row++) {
		for(int col =1; col<=n; col++) {
			cout<<n;
		}
		cout<<endl;
	}
	return 0;
}


