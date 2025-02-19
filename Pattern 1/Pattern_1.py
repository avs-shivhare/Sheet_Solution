class Solution:
    def printSquare(self, n):
        # square have same no. of row and col
        for row in range(1,n+1):
            for col in range(1,n+1):
                print("*",end= " ")
            print()
