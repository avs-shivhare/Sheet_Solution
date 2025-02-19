class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        long mini = Long.MAX_VALUE, maxi = Long.MIN_VALUE;
        for (long i : arr) {
            mini = Math.min(mini, i);
            maxi = Math.max(maxi, i);
        }
        return new Pair(mini, maxi);
    }
}
