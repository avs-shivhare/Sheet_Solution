class Solution:
    def check(s, x):
        if len(s) != len(x) + 1:
            return False
        
        i, j = 0, 0
        while i < len(s):
            if j < len(x) and s[i] == x[j]:
                j += 1
            i += 1
        
        return j == len(x)
    def longestStringChain(self, words):
        words.sort(key=len)
        dp = {}
        ans = 0
        
        for word in words:
            dp[word] = 1
            for i in range(len(word)):
                prev = word[:i] + word[i+1:]
                if prev in dp:
                    dp[word] = max(dp[word], dp[prev] + 1)
            ans = max(ans, dp[word])
        
        return ans
