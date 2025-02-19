class Solution:
    def printTriangle(self, n):
        # see the give pattern
        # start is printed only if either row =1, row =n,col =1,col =n
        for row in range(1,n+1):
            for col in range(1,n+1):
                if row == 1 or row == n or col == 1 or col == n:
                    print("*",end= "")
                else:
                    print(end = " ")
            print()
