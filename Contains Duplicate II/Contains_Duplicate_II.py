class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        mpp = {}
        n = len(nums)
        for i in range(n):
            if nums[i] in mpp and abs(mpp[nums[i]] - i) <= k:
                return True
            mpp[nums[i]] = i
        return False
        