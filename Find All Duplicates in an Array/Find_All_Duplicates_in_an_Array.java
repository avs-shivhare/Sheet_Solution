class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i : nums) {
            mpp.put(i, mpp.getOrDefault(i, 0) + 1);
        }
        List<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            if (entry.getValue() == 2) {
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}