class Solution {
    public int threeSumClosest(int[] nums, int target) {
         int n = nums.length;
        int diff = Integer.MAX_VALUE, ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(sum - target) < diff) {
                    ans = sum;
                    diff = Math.abs(sum - target);
                }
                if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return ans;
    }
}