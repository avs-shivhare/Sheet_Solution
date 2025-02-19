class Solution:
    def longest(self, names):
        ans = ""
        for i in names:
            if len(ans) < len(i):
                ans = i
        return ans
