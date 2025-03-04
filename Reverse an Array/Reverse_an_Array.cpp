class Solution {
  public:
    void reverseArray(vector<int> &nums) {
        int left = 0,right = nums.size()-1;
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return;
    }
};