class Solution:
    def countWords(self, words1: List[str], words2: List[str]) -> int:
        mpp = Counter(words1)
        mpp2 = Counter(words2)
        
        return sum(1 for word in mpp if mpp[word] == 1 and mpp2.get(word, 0) == 1)
        