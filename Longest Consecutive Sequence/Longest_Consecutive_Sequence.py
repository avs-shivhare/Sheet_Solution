class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        mpp = dict()
        for num in nums:
            mpp[num] = 1
        
        ans = 0
        for num in sorted(mpp.keys()):
            if num - 1 in mpp:
                mpp[num] = mpp[num - 1] + 1
            ans = max(ans, mpp[num])
        
        return ans
        