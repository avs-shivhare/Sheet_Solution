class Solution {
    void leftRotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        if (k == 0) return;

        int[] temp = Arrays.copyOf(arr, n);

        for (int i = 0; i < n; i++) {
            arr[i] = temp[(i + k) % n];
        }
    }
}