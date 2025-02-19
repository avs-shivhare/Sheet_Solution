class Solution:
    def maxNtype(self , arr):
        inc = 0
        dec = 0
        n = len(arr)

        for i in range(1, n):
            if arr[i - 1] <= arr[i]:
                inc += 1
            else:
                dec += 1

        if inc == 0:
            return 2
        elif dec == 0:
            return 1
        elif dec > inc:
            return 3
        return 4
