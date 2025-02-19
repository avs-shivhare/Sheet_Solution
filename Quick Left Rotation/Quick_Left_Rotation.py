class Solution:
    def leftRotate(self, arr, k):
        n = len(arr)
        k = k % n
        if k == 0:
            return

        temp = arr[:]
        for i in range(n):
            arr[i] = temp[(i + k) % n]
