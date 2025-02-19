class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        mpp = Counter(nums1)
        ans = []
        for i in nums2:
            if mpp[i] > 0:
                ans.append(i)
                mpp[i] -= 1
        return ans
        