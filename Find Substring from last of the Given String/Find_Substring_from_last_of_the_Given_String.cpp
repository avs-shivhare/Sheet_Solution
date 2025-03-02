class Solution{
public:		

	int search(string x, string y)
	{
	    int n = x.size();
	    int m = y.size();
	    int ind = -1;
	    for(int i = 0; i<n; i++) {
	        if(x[i] == y[0]) {
	            string temp = x.substr(i,m);
	            if(temp == y) {
	                ind = i;
	            }
	        }
	    }
	    if(ind == -1) return ind;
	    return ind+1;
	}
};