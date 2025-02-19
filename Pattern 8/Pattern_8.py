class Solution:
    def printTriangle(self, n):
        for i in range(n-1,-1,-1):
            for j in range(n-1,i,-1):
                print(end = " ")
            for j in range(2*i+1,0,-1):
                print(end = "*")
            print()
	        
