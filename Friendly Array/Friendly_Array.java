class Solution {
    public int calculateFriendliness(int[] arr) {
        int ans = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            ans += Math.abs(arr[i] - arr[i - 1]);
        }
        ans += Math.abs(arr[0] - arr[n - 1]);
        return ans;
    }
}