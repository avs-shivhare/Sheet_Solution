class Solution:
    def multiply(self, arr):
        n = len(arr)
        sum1 = sum(arr[:n//2])
        sum2 = sum(arr[n//2:])
        return sum1 * sum2
