class Solution:
    def get_min_max(self, arr):
        mini = float('inf')
        maxi = float('-inf')
        for i in arr:
            mini = min(mini, i)
            maxi = max(maxi, i)
        return (mini, maxi)
