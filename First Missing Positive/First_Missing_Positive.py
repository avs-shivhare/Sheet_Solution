class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        st = set(nums)
        n = len(nums)
        for i in range(1, n + 1):
            if i not in st:
                return i
        return n + 1
        