class Solution:
    def sumArray(self, arr):
        # 1st solution
        total_sum = sum(arr)
        for i in range(len(arr)):
            arr[i] = total_sum - arr[i]
        
        # 2nd solution
        
        # n = len(arr)
        # prefix = [0] * n
        # suffix = [0] * n
        # total_sum = 0

        # for i in range(n):
        #     prefix[i] = total_sum
        #     total_sum += arr[i]

        # total_sum = 0
        # for i in range(n - 1, -1, -1):
        #     suffix[i] = total_sum
        #     total_sum += arr[i]

        # for i in range(n):
        #     arr[i] = prefix[i] + suffix[i]
