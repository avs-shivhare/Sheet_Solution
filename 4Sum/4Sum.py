class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        ans = []
        nums.sort()
        n = len(nums)
        i = 0
        while i < n:
            if i > 0 and nums[i] == nums[i - 1]:
                i += 1
                continue
            j = i + 1
            while j < n:
                if j > i + 1 and nums[j] == nums[j - 1]:
                    j += 1
                    continue
                x, y = j + 1, n - 1
                while x < y:
                    sum_ = nums[i] + nums[j] + nums[x] + nums[y]
                    if sum_ == target:
                        ans.append([nums[i], nums[j], nums[x], nums[y]])
                        x += 1
                        y -= 1
                        while x < y and nums[x] == nums[x - 1]:
                            x += 1
                        while x < y and nums[y] == nums[y + 1]:
                            y -= 1
                    elif sum_ < target:
                        x += 1
                    else:
                        y -= 1
                j += 1
            i += 1
        return ans
        