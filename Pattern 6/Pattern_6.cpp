class Solution{
public:
	
	void printTriangle(int n) {
	    // simple pattern just iterate on the loop 
	    // print on every row with values is 1 to i
	    
	    for(int i =n; i>0; i--) {
	        for(int j =1; j<=i; j++) {
	            cout<<j<<" ";
	        }
	        cout<<endl;
	    }
	}
};
