class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = Counter(nums)
        temp = sorted(count.items(), key=lambda x: x[1], reverse=True)
        ans = [temp[i][0] for i in range(k)]
        return ans
        