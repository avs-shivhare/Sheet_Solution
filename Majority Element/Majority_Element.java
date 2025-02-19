class Solution {
    public int majorityElement(int[] nums) {
        int element = 0, cnt = 0;
        for (int i : nums) {
            if (element == i) cnt++;
            else cnt--;
            if (cnt <= 0) {
                element = i;
                cnt = 1;
            }
        }
        return element;
    }
}