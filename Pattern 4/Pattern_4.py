class Solution:
    def printTriangle(self, n):
        # first look given example and try to yourself
        # total no. of element in each row is equal to row no.
        # each element in a row is the row no.
        for row in range(1,n+1):
            for col in range(1,row+1):
                print(row,end = " ")
            print()