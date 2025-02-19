
class Solution:
    def printTriangle(self, n):
        # iterate on the loop in reverse direction
	    # for every i print i asterisk(*)
	    for i in range(n,0,-1):
	        for j in range(1,i+1):
	            print("*",end= " ")
	        print()
	       