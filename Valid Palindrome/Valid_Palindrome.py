class Solution:
    def isPalindrome(self, s: str) -> bool:
        ans = ""
        for char in s.lower():
            if '0' <= char <= '9' or 'a' <= char <= 'z':
                ans += char
        left, right = 0, len(ans) - 1
        while left < right:
            if ans[left] != ans[right]:
                return False
            left += 1
            right -= 1
        return True







        