class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        first, second = 0, len(nums) - 1
        while first <= second:
            if nums[first] == val:
                nums[first], nums[second] = nums[second], nums[first]
                second -= 1
            else:
                first += 1
        return first

        