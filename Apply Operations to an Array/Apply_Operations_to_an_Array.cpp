class Solution {
public:
    vector<int> applyOperations(vector<int>& nums) {
        int n = nums.size();
        for(int i = 0; i<n-1; i++) {
            if(nums[i] == nums[i+1]) {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        int first = 0,second = 0;
        while(second < n) {
            if(nums[first] == 0 && nums[second] != 0) {
                int temp = nums[first];
                nums[first] = nums[second];
                nums[second] = temp;
            }
            if(nums[first] != 0) first++;
            second++;
        }
        return nums;
    }
};