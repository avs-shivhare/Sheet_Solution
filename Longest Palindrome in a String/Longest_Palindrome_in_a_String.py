class Solution:
    def longestPalindrome(self, s):
        n = len(s)
        start = 0
        size = 0
        for i in range(0,n):
            left = i
            right = i
            while left >=0 and right < n and s[left] == s[right]:
                if right-left+1 > size:
                    start = left
                    size = right-left+1
                
                left -=1
                right +=1
            
            left = i
            right = i+1
            while left >=0 and right < n and s[left] == s[right]:
                if right-left+1 > size:
                    start = left
                    size = right-left+1
                
                left -=1
                right +=1
        
        return s[start:start+size]
