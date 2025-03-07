class Solution {
    public int removeElement(int[] nums, int val) {
        int first = 0,second = nums.length-1;
        while(first <= second) {
            if(nums[first] == val) {
                int temp = nums[first];
                nums[first] = nums[second];
                nums[second] = temp;
                second--;
            }
            else first++;
        }
        return first;
    }
}