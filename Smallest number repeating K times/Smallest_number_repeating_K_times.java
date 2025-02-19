class Solution {
    public int findDuplicate(int[] arr, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i : arr) {
            mpp.put(i, mpp.getOrDefault(i, 0) + 1);
        }
        int ans = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            if (entry.getValue() == k && ans > entry.getKey()) {
                ans = entry.getKey();
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}