class Solution:
    def vowel(self, x):
        x = x.lower()
        return x in "aeiou"
    def reverseVowels(self, s: str) -> str:
        s = list(s)
        left, right = 0, len(s) - 1
        while left < right:
            if self.vowel(s[left]) and self.vowel(s[right]):
                s[left], s[right] = s[right], s[left]
                left += 1
                right -= 1
            elif self.vowel(s[left]):
                right -= 1
            else:
                left += 1
        return "".join(s)
        