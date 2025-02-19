class Solution:
    def findDuplicate(self, arr, k):
        mpp = {}
        for i in arr:
            mpp[i] = mpp.get(i, 0) + 1
        ans = float('inf')
        for key, value in mpp.items():
            if value == k and ans > key:
                ans = key
        return -1 if ans == float('inf') else ans

