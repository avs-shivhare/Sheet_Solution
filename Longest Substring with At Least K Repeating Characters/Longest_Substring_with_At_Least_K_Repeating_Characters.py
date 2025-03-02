class Solution:
    def longestSubstring(self, s: str, k: int) -> int:
        n = len(s)
        ans = 0
        for i in range(0,n):
            fre = [0]*26
            for j in range(i,n):
                fre[ord(s[j])-ord('a')] +=1
                flag = True
                for x in range(0,26):
                    if fre[x] > 0:
                        if fre[x] < k:
                            flag = False
                            break
                if flag:
                    ans = max(ans,j-i+1)
        return ans
        