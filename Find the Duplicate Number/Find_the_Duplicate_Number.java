class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i : nums) {
            mpp.put(i, mpp.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            if (entry.getValue() >= 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}