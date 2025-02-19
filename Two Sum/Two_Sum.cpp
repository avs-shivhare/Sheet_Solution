class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> mpp;
        int n = nums.size();
        for(int i =0;i<n; i++) {
            int remaining = target-nums[i];
            if(mpp.count(remaining)) {
                return {i,mpp[remaining]};
            }
            mpp[nums[i]] = i;
        }
        // dummy statement
        return {-1};
    }
};