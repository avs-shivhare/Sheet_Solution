class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        element, cnt = 0, 0
        for i in nums:
            if element == i:
                cnt += 1
            else:
                cnt -= 1
            if cnt <= 0:
                element = i
                cnt = 1
        return element
        