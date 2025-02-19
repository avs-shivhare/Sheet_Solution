class Solution {
    public int findUnique(int k, int[] arr) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i : arr) {
            mpp.put(i, mpp.getOrDefault(i, 0) + 1);
        }

        for (int key : mpp.keySet()) {
            if (mpp.get(key) % k != 0) {
                return key;
            }
        }
        return -1;
    }
}