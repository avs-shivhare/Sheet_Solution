class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        n = len(nums)
        st = set()
        
        for i in range(n):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            j, k = i + 1, n - 1
            
            while j < k:
                total = nums[i] + nums[j] + nums[k]
                if total == 0:
                    st.add((nums[i], nums[j], nums[k]))
                    j += 1
                    k -= 1
                    while j < k and nums[j] == nums[j - 1]:
                        j += 1
                    while j < k and nums[k] == nums[k + 1]:
                        k -= 1
                elif total > 0:
                    k -= 1
                else:
                    j += 1

        return list(map(list, st))
        