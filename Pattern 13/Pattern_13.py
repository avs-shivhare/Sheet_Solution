class Solution:
    def printTriangle(self, n):
        # same approach as previous question but the difference is that 
        # instate of printing row no. we have to print no. from increasing
        # order in every element from 1 to n
        no =1;
        for row in range(1,n+1):
            for col in range(1,row+1):
                print(no,end = " ")
                no +=1
            print()
