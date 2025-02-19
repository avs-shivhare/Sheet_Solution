class Solution:
    def findMaxProduct(self, arr, k):
        ans = 0
        l = 0
        r = 0
        n = len(arr)
        product = 1

        while r < n:
            product *= arr[r]
            while l <= r and r - l + 1 > k:
                product //= arr[l]
                l += 1
            if r - l + 1 == k:
                ans = max(ans, product)
            r += 1
        return ans
