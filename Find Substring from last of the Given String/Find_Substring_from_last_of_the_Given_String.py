class Solution:
	def search(self, X, Y):
		ind = X.rfind(Y)
		if ind == -1:
		    return -1
		return ind+1
