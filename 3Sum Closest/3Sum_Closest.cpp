class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int n = nums.size();
        int diff = 1e9,ans = 0;
        sort(nums.begin(),nums.end());
        for(int i =0;i<n; i++) {
            int j =i+1,k = n-1;
            while(j<k) {
                int sum = nums[i]+nums[j]+nums[k];
                if(abs(sum-target) < diff) {
                    ans = sum;
                    diff = abs(sum-target);
                }
                if(sum > target) k--;
                else j++;
            }
        }
        return ans;
    }
};