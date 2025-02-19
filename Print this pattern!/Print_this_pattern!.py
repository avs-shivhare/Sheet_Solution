class Solution:
	def printPattern(self, n):
		for i in range(n, 0, -1):
            temp = ""
            for j in range(n, 0, -1):
                if j >= i:
                    temp += str(j)
                else:
                    temp += str(i)
            
            tt = temp
            reversed_temp = temp[::-1]
            print(tt[:-1] + reversed_temp)

    
        for i in range(2, n + 1):
            temp = ""
            for j in range(n, 0, -1):
                if j >= i:
                    temp += str(j)
                else:
                    temp += str(i)
            
            tt = temp
            reversed_temp = temp[::-1]
            print(tt[:-1] + reversed_temp)
