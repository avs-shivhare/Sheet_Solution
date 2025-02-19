class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mpp = {}
        for i, num in enumerate(nums):
            remaining = target - num
            if remaining in mpp:
                return [i, mpp[remaining]]
            mpp[num] = i
        # dummy statement
        return [-1]
        