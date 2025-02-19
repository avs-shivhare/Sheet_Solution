class Solution:
    def printTriangle(self, n):
        # just reverse version of previous question
        # iterate on outer loop on backward
        for row in range(n,0,-1):
            no = 65
            for col in range(1,row+1):
                print(chr(no),end = "")
                no +=1
            print()
        
