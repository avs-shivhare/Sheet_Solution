class Solution:
    def printTriangle(self, n):
        # same as previous question
        # in each row have element that is equal to 2*i+1
        # in zero based indexing
        # haft +1 character are increase and remaing are decreasing
        for i in range(0,n):
        
            # spaces
            for j in range(n-1,i,-1):
                print(end= " ")
                
            el = 65
            # character
            for j in range(0,2*i+1):
                print(chr(el),end="")
                if j < i:  
                    el += 1
                else:
                    el -= 1
            print()
 