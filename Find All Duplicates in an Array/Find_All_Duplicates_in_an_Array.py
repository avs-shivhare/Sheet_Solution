class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        mpp = {}
        for i in nums:
            mpp[i] = mpp.get(i, 0) + 1
        ans = []
        for key, value in mpp.items():
            if value == 2:
                ans.append(key)
        return ans
        