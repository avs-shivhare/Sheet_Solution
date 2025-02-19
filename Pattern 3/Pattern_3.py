class Solution:
    def printTriangle(self, n):
        # simple pattern if you look of given example you can build logic
        # to solve this pattern
        # in each row no. of element is equal to row number
        # and every element start with 1 and increase by one upto row nu.
        for row in range(1,n+1):
            for col in range(1,row+1):
                print(col,end= " ")
            print()
     