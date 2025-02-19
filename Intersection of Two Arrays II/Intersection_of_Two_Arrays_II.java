class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i : nums1) {
            mpp.put(i, mpp.getOrDefault(i, 0) + 1);
        }
        List<Integer> ansList = new ArrayList<>();
        for (int i : nums2) {
            if (mpp.containsKey(i)) {
                ansList.add(i);
                mpp.put(i, mpp.get(i) - 1);
                if (mpp.get(i) == 0) {
                    mpp.remove(i);
                }
            }
        }
        int[] ans = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }
        return ans;
    }
}