class Solution:
    def printTriangle(self, n):
        # simple pattern just iterate on the loop 
	    # print on every row with values is 1 to i
	    
	    for i in range(n,0,-1):
	        for j in range(1,i+1):
	            print(j,end= " ")
	        print()
	    