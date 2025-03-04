class Solution:
	def countOddEven(self, arr):
		odd = 0
		even = 0
		for i in arr:
		    if i%2 == 1:
		        odd +=1
		    else: 
		        even+=1
		return [odd,even];

