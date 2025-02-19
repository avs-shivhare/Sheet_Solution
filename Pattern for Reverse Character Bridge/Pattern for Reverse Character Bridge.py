class Solution:
    def revCharBridge(self, n):
        ans = []
        
        for i in range(n, 0, -1):
            temp = ""
            ch = ord('A')
            
            for j in range(1, n + 1):
                if j <= i:
                    temp += chr(ch)
                    ch += 1
                else:
                    temp += " "
            
            t = temp
            temp = temp[::-1]
            ans.append(t + temp[1:])
        
        return ans
