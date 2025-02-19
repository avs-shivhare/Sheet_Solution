class Solution{
public:	
	
	vector<string> pattern(string s)
	{
	    // here we have to print character in each row
	    // start with full length and decrease by 1
	    int n = s.size();
	    vector<string> ans;
	    for(int i = n; i>0; i--) {
	        string temp = "";
	        for(int j =0; j<i; j++) {
	           temp += s[j];
	        }
	        ans.push_back(temp);
	    }
	    return ans;
	}

};