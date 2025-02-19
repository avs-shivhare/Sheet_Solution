class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        first, second, cnt1, cnt2 = 0, 0, 0, 0
        for i in nums:
            if i == first:
                cnt1 += 1
            elif i == second:
                cnt2 += 1
            elif cnt1 == 0:
                first = i
                cnt1 = 1
            elif cnt2 == 0:
                second = i
                cnt2 = 1
            else:
                cnt1 -= 1
                cnt2 -= 1
        
        cnt1, cnt2 = 0, 0
        for i in nums:
            if i == first:
                cnt1 += 1
            elif i == second:
                cnt2 += 1
        
        ans = []
        n = len(nums)
        if cnt1 > n // 3:
            ans.append(first)
        if cnt2 > n // 3:
            ans.append(second)
        
        return ans
        