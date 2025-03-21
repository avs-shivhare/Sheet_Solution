class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string>> mpp;
        for(auto i: strs) {
            string x = i;
            sort(x.begin(),x.end());
            mpp[x].push_back(i);
        }
        vector<vector<string>> ans;
        for(auto i: mpp) {
            ans.push_back(i.second);
        }
        return ans;
    }
};