class Solution:
    def checkAlmostEquivalent(self, word1: str, word2: str) -> bool:
        mpp = Counter(word1)
        mpp2 = Counter(word2)
        
        for c in set(mpp.keys()).union(mpp2.keys()):
            if abs(mpp.get(c, 0) - mpp2.get(c, 0)) > 3:
                return False
        
        return True
        