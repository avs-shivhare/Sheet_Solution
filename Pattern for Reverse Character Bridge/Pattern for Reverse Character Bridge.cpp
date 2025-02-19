class Solution {
  public:
    vector<string> revCharBridge(int n) {
        vector<string> ans;
        for(int i =n; i>0; i--) {
            string temp = "";
            char ch = 'A';
            for(int j =1; j<=n; j++) {
                if(j<=i) temp += ch++;
                else temp += " ";
            }
            string t = temp;
            reverse(temp.begin(),temp.end());
            ans.push_back(t+temp.substr(1));
        }
        return ans;
    }
};