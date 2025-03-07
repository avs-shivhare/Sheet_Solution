class Solution {
    public void sortColors(int[] nums) {
        int first = 0,second = nums.length-1;
        int i = 0;
        while(i<=second) {
            if(nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[first];
                nums[first] = temp;
                first++;
                i++;
            }
            else if(nums[i] == 2) {
                int temp = nums[second];
                nums[second] = nums[i];
                nums[i] = temp;
                second--;
            }
            else {
                i++;
            }
        }
        return;
    }
}