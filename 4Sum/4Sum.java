class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            int j = i + 1;
            while (j < n) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    j++;
                    continue;
                }
                int x = j + 1, y = n - 1;
                while (x < y) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[x] + (long) nums[y];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[x], nums[y]));
                        x++;
                        y--;
                        while (x < y && nums[x] == nums[x - 1]) x++;
                        while (x < y && nums[y] == nums[y + 1]) y--;
                    } else if (sum < target) {
                        x++;
                    } else {
                        y--;
                    }
                }
                j++;
            }
            i++;
        }
        return ans;
    }
}