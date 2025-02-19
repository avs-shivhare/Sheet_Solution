class Solution:
    def swapKth(self, k, arr):
        arr[k-1], arr[len(arr)-k] = arr[len(arr)-k], arr[k-1]
        
