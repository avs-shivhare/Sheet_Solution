class Solution {
  public:
    string longest(vector<string> &names) {
        string ans = "";
        for(auto i: names) {
            if(ans.size() < i.size()) {
                ans =i;
            }
        }
        return ans;
    }
};