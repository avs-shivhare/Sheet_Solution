class Solution:
    def invIsoTriangle(self, n):
        # in this question in one row there are 2*n-1 element
        # and each row have spaces in starting and ending
        # in zero based indexing no. of space are equal to row no.
        ans = []
        for i in range(0,n):
            temp = ""
            # space
            for j in range(0,i):
                temp += " "
           
            # star
            for j in range(2*(n-i)-1,0,-1):
                temp += "*"
        
            # space
            for j in range(0,i):
                temp += " "
            
            ans.append(temp)
        
        return ans; 
