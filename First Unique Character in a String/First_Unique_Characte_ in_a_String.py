class Solution:
    def firstUniqChar(self, s: str) -> int:
        mpp = Counter(s)
        for i, c in enumerate(s):
            if mpp[c] == 1:
                return i
        return -1
        