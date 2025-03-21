class Solution {
public:
    int countWords(vector<string>& words1, vector<string>& words2) {
        unordered_map<string,int> mpp,mpp2;
        for(auto i: words1) {
            mpp[i]++;
        }
        for(auto i: words2) {
            mpp2[i]++;
        }
        int ans = 0;
        for(auto i: mpp) {
            if(i.second == 1 && mpp2[i.first] == 1) ans++;
        }
        return ans;
    }
};