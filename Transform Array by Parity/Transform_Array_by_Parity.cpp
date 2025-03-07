class Solution {
public:
    vector<int> transformArray(vector<int>& nums) {
        int n = nums.size();
        for(int i = 0; i<n; i++) {
            if(nums[i]%2 == 0) {
                nums[i] = 0;
            }
            else {
                nums[i] = 1;
            }
        }
        int first = 0,second = 0;
        while(second < n) {
            if(nums[first] == 1 && nums[second] == 0) {
                int temp = nums[first];
                nums[first] = nums[second];
                nums[second] = temp;
            }
            if(nums[first] == 0) first++;
            second++;
        }
        return nums;
    }
};