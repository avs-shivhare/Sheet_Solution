class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> st = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();
        for (int i : nums1) {
            st.add(i);
        }
        for (int i : nums2) {
            st2.add(i);
        }
        int[] res = new int[st2.size()];
        int idx = 0;
        for (int i : st2) {
            if (st.contains(i)) {
                res[idx++] = i;
            }
        }
        return Arrays.copyOf(res, idx);
    }
}