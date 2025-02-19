class Solution:
	def _sum(self,arr):
   		# simple question 
        # we have to just add all element 
        # we can do this with linear traversal
        # linear traversal means visit every element
        # one by one and add into total
        total = 0
        n = len(arr)
        for i in range(n):
            total += arr[i]
        return total
