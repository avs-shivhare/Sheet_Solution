class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        mpp = Counter(s)
        return len(set(mpp.values())) == 1
        