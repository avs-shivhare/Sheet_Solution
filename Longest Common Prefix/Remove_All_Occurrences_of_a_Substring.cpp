class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        unordered_map<string,int> mpp;
        for(auto i: strs) {
            for(int j = 0; j<i.size(); j++) {
                string temp = i.substr(0,j+1);
                mpp[temp]++;
            }
        }
        int n = strs.size();
        string ans = "";
        for(auto i: mpp) {
            if(i.second == n) {
                if(ans.size() < i.first.size()) {
                    ans = i.first;
                }
            }
        }
        return ans;
    }
};