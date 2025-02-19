class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        n = len(nums)
        diff = float('inf')
        ans = 0
        nums.sort()
        for i in range(n):
            j, k = i + 1, n - 1
            while j < k:
                sum_ = nums[i] + nums[j] + nums[k]
                if abs(sum_ - target) < diff:
                    ans = sum_
                    diff = abs(sum_ - target)
                if sum_ > target:
                    k -= 1
                else:
                    j += 1
        return ans
        