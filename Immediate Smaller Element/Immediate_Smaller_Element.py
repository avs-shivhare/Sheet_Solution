class Solution:

	def immediateSmaller(self,arr,n):
		for i in range(1, n):
            if arr[i - 1] > arr[i]:
                arr[i - 1] = arr[i]
            else:
                arr[i - 1] = -1
        arr[n - 1] = -1
