class Solution{
public:
	
	void printTriangle(int n) {
	    // iterate on the loop in reverse direction
	    // for every i print i asterisk(*)
	    for(int i =n; i>0; i--) {
	        for(int j =1; j<=i; j++) {
	            cout<<"* ";
	        }
	        cout<<endl;
	    }
	}
};
