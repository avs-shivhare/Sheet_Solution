class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        st = set(nums1)
        st2 = set(nums2)
        return [i for i in st2 if i in st]
        