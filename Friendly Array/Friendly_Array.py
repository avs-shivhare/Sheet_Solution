class Solution:
    def calculateFriendliness(self, arr):
        ans = 0
        n = len(arr)
        for i in range(1, n):
            ans += abs(arr[i] - arr[i - 1])
        ans += abs(arr[0] - arr[n - 1])
        return ans
