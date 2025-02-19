class Solution:
    def printTriangle(self, n):
        # in this pattern 
        # if row no. is even in zero based indexing then 
        # element start with 1
        # otherwise 0
        # and change alternative
        for i in range(0,n):
            flag = False
            if i%2 == 0: 
                flag = True
            for j in range(0,i+1):
                if flag: 
                    print(1,end = " ")
                else: 
                    print(0,end = " ")
                flag = not flag
            print()
