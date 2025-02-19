class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int remaining = target - nums[i];
            if (mpp.containsKey(remaining)) {
                return new int[] {i, mpp.get(remaining)};
            }
            mpp.put(nums[i], i);
        }
        // dummy statement
        return new int[] {-1};
    }
}