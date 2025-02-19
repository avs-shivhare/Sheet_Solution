class Solution:
    def interestingPattern(self, n):
        ans = []
        
        for i in range(n, 0, -1):
            temp = ""
            for j in range(n, 0, -1):
                if j >= i:
                    temp += str(j)
                else:
                    temp += str(i)
            tt = temp
            temp = tt[:-1] + temp[::-1]
            ans.append(temp)
        
        for i in range(2, n + 1):
            temp = ""
            for j in range(n, 0, -1):
                if j >= i:
                    temp += str(j)
                else:
                    temp += str(i)
            tt = temp
            temp = tt[:-1] + temp[::-1]
            ans.append(temp)
        
        s = "";
        for i in ans:
            s += i+"\n"
        return s    
