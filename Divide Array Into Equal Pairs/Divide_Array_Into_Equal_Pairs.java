class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }
        for (int count : mpp.values()) {
            if (count % 2 == 1) {
                return false;
            }
        }
        return true;
    }
}