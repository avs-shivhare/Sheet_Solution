class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        mpp = {}
        for i in nums:
            mpp[i] = mpp.get(i, 0) + 1
        for k, v in mpp.items():
            if v >= 2:
                return k
        return -1
        