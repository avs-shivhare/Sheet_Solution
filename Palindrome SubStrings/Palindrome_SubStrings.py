class Solution:

    def countPS(self, s):
        ans = 0
        n = len(s)
        for i in range(0,n):
            left = i
            right = i
            # for odd length palindrome substring
            while left >=0 and right < n and s[left] == s[right]:
                if right-left+1 >= 2:
                    ans +=1
                left -=1
                right +=1
            # for even length palindrome substring
            left = i;
            right = i+1;
            while left >=0 and right < n and s[left] == s[right]:
                if right-left+1 >= 2:
                    ans +=1
                left -=1
                right +=1
        
        return ans;