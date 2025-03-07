class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        first = 0
        second = 0
        n = len(nums)
        while second < n:
            if nums[first]%2 == 1 and nums[second]%2 == 0:
                temp = nums[first]
                nums[first] = nums[second]
                nums[second] = temp;
            if nums[first]%2 == 0:
                first +=1
            second +=1
        return nums    