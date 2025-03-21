class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        map<int,int> mpp;
        for(auto i: nums) {
            mpp[i] = 1;
        }
        int ans = 0;
        for(auto &i: mpp) {
            i.second = max(i.second,mpp[i.first-1]+1);
            ans = max(ans,i.second);
        }
        return ans;
    }
};