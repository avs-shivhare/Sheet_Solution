class Solution:
    def longestCommonPrefix(self, strs: list[str]) -> str:
        mpp = defaultdict(int)
        n = len(strs)

        for s in strs:
            for j in range(len(s)):
                temp = s[:j + 1]
                mpp[temp] += 1

        ans = ""
        for key, value in mpp.items():
            if value == n and len(key) > len(ans):
                ans = key

        return ans