class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (mpp.containsKey(nums[i]) && Math.abs(mpp.get(nums[i]) - i) <= k) return true;
            mpp.put(nums[i], i);
        }
        return false;
    }
}