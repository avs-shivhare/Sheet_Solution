class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int,int> mpp;
        for(auto i: nums1) {
            mpp[i]++;
        }
        vector<int> ans;
        for(auto i: nums2) {
            if(mpp.count(i)) {
                ans.push_back(i);
                mpp[i]--;
                if(mpp[i] == 0) mpp.erase(i);
            }
        }
        return ans;
    }
};