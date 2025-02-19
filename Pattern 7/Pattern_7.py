class Solution:
    def printTriangle(self, n):
        for i in range(0,n):
            for j in range(n-1,i,-1):
                print(end= " ")
            for j in range(0,2*i+1):    
                print(end= "*");
            print()
        
