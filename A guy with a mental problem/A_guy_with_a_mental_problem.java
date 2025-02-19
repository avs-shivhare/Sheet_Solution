class Solution {
    public int minTime(int[] arr1, int[] arr2) {
        boolean flag = true;
        int sum1 = arr1[0], sum2 = arr2[0];
        int n = arr1.length;

        for (int i = 1; i < n; i++) {
            if (flag) {
                sum1 += arr2[i];
                sum2 += arr1[i];
            } else {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            flag = !flag;
        }
        return Math.min(sum1, sum2);
    }
}