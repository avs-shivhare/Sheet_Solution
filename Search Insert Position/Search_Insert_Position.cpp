class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int n = nums.size();
        if(nums[n-1] < target) return n;
        int ans = -1;
        for(int i =0; i<n; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return -1;
    }
};