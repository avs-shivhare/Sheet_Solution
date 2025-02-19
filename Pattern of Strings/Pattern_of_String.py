class Solution:
	def pattern(self, s):
		# here we have to print character in each row
	    # start with full length and decrease by 1
	    n = len(s)
	    ans = []
	    for i in range(n,0,-1):
	        temp = ""
	        for j in range(0,i):
	           temp += s[j]
	        ans.append(temp);

	    return ans;

