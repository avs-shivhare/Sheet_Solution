class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        n = len(nums)
        for i in range(n - 1):
            if nums[i] == nums[i + 1]:
                nums[i] *= 2
                nums[i + 1] = 0

        first, second = 0, 0
        while second < n:
            if nums[first] == 0 and nums[second] != 0:
                nums[first], nums[second] = nums[second], nums[first]
            if nums[first] != 0:
                first += 1
            second += 1
            
        return nums
        