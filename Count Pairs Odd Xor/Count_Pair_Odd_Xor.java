class Solution {
    public long countOddXorPairs(int[] arr) {
        long odd = 0, even = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return odd * even;
    }
}