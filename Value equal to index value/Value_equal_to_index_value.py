class Solution:
    # Function to find values in array equal to their indices
    def valueEqualToIndex(self, arr):
        ans = []
        for i in range(1, len(arr) + 1):
            if arr[i - 1] == i:
                ans.append(arr[i - 1])
        return ans

