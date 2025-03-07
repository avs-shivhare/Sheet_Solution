class Solution:
    def sortColors(self, nums: List[int]) -> None:
        first, second = 0, len(nums) - 1
        i = 0
        while i <= second:
            if nums[i] == 0:
                nums[i], nums[first] = nums[first], nums[i]
                first += 1
                i += 1
            elif nums[i] == 2:
                nums[i], nums[second] = nums[second], nums[i]
                second -= 1
            else:
                i += 1
        """
        Do not return anything, modify nums in-place instead.
        """
        