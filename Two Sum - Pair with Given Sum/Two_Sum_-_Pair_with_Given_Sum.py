class Solution:
	def twoSum(self, arr, target):
		arr.sort()
        left, right = 0, len(arr) - 1
        while left < right:
            sum_ = arr[left] + arr[right]
            if sum_ == target:
                return True
            elif sum_ < target:
                left += 1
            else:
                right -= 1
        return False
