class Solution:
    def yShapedPattern(self, n):
        ans = []
        left, right = 1, n + 1
        
        for i in range(1, n + 1):
            temp = ""
            
            for j in range(1, n + 2):
                if j == left or j == right:
                    temp += "*"
                else:
                    temp += " "
            
            if left < right:
                left += 1
                right -= 1
            
            ans.append(temp)
        
        s = "";
        for i in ans:
            s += i+ "\n"
        return s;
