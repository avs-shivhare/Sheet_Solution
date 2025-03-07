class Solution:
    def transformArray(self, nums: List[int]) -> List[int]:
        n = len(nums)
        for i in range(0,n):
            if nums[i]%2 == 0:
                nums[i] = 0
            else:
                nums[i] = 1

        first = 0
        second = 0
        while second < n:
            if nums[first] == 1 and nums[second] == 0:
                temp = nums[first]
                nums[first] = nums[second]
                nums[second] = temp
            
            if nums[first] == 0:
                first +=1
            second += 1
        return nums
        