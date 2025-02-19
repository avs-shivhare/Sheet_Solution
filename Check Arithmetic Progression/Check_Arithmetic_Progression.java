class Solution {
    
    public boolean checkIsAP(int[] arr) {
        Arrays.sort(arr);
        int temp = -1;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (temp == -1) {
                temp = Math.abs(arr[i] - arr[i - 1]);
            } else if (temp != Math.abs(arr[i] - arr[i - 1])) {
                return false;
            }
        }
        return true;
    }
}