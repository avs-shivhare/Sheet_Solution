class Solution:
    def printTriangle(self, n):
        # similar approach as seen in previous question
        # difference is that we replace character with no.
        for row in range(1,n+1):
            no = 65;
            for col in range(1,row+1):
                print(chr(no),end = "")
                no +=1
            print()
       