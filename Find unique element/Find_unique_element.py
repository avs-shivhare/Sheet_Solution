class Solution:
    def find_unique(self, k, arr):
        mpp = {}

        for i in arr:
            mpp[i] = mpp.get(i, 0) + 1

        for key, value in mpp.items():
            if value % k != 0:
                return key
        return -1
