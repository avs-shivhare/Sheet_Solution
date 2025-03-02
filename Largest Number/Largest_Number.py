class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        numStrs = list(map(str, nums))
        numStrs.sort(key=lambda x: x*10, reverse=True)
        ans = ''.join(numStrs)
        return "0" if ans[0] == '0' else ans
        