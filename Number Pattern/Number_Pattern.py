class Solution:
	def numberPattern(self, n):
		# we have to store number as a string 
        # try to find pattern 
        ans = []
        # first loop is running from i-> 1 to n
        for i in range(1,n+1):
            # then 1 to i value are store in string 
            temp= "";
            for j in range(1,i+1):
                temp += str(j)
            
            # after that i-1 to 1 values are stored
            for j in range(i-1,0,-1):
                temp += str(j)
            
            ans.append(temp);
        
        return ans;
