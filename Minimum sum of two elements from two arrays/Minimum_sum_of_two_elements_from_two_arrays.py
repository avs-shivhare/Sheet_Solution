class Solution:
    def minimum(self, arr):
        mini = int(1e9)
        second_mini = int(1e9)
        min_index = -1
        second_mini_index = -1

        for i in range(len(arr)):
            if mini > arr[i]:
                second_mini = mini
                second_mini_index = min_index
                mini = arr[i]
                min_index = i
            elif second_mini > arr[i]:
                second_mini = arr[i]
                second_mini_index = i

        return [mini, second_mini, min_index, second_mini_index]

    def minSum(self, arr1, arr2):
        x = self.minimum(arr1)
        y = self.minimum(arr2)
        ans = int(1e9)

        if x[2] != y[2]:
            return x[0] + y[0]
        elif (len(arr1) == 1 and len(arr2) > 1) or (len(arr2) == 1 and len(arr1) > 1):
            return min(x[0], y[0])

        if x[3] != -1:
            ans = min(ans, y[0] + x[1])

        if y[3] != -1:
            ans = min(ans, x[0] + y[1])

        if ans == int(1e9):
            return -2147483648
        
        return ans
