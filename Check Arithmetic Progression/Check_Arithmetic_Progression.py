class Solution:
    def checkIsAP(self, arr):
        arr.sort()
        temp = -1
        for i in range(1, len(arr)):
            if temp == -1:
                temp = abs(arr[i] - arr[i - 1])
            elif temp != abs(arr[i] - arr[i - 1]):
                return False
        return True
