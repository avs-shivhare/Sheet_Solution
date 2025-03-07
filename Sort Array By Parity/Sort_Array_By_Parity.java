class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int first = 0,second = 0;
        int n = nums.length;
        while(second < n) {
            if(nums[first]%2 == 1 && nums[second]%2 == 0) {
                int temp = nums[first];
                nums[first] = nums[second];
                nums[second] = temp;
            }
            if(nums[first]%2 == 0) first++;
            second++;
        }
        return nums;
    }
}