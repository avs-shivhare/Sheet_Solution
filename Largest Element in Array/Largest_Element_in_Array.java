lass Solution {
    public static int largest(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for (int i : arr) {
            maxi = Math.max(maxi, i);
        }
        return maxi;
    }
}