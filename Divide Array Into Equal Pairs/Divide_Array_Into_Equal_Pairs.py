class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        mpp = Counter(nums)
        return all(count % 2 == 0 for count in mpp.values())
        