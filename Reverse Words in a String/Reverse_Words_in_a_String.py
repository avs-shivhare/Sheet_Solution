class Solution:
    def reverseWords(self, s: str) -> str:
        temp = s.strip().split()
        temp.reverse()
        return ' '.join(temp)

        