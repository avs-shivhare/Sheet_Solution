class Solution:
    def printTriangle(self, n):
        # try to solve this problem by yourself 
        
        # in starting pattern is increase 
        # mean in every cell pattern is increasing
        # till nth row
        # after that it start decreasing
        
        # for increasing pattern
        for i in range(1,n+1):
            for j in range(1,i+1):
                print("*",end=" ");
            print()
           
        # for decreasing pattern
        for i in range(n-1,0,-1):
            for j in range(1,i+1):
                print("*",end=" ");
            print()
       
