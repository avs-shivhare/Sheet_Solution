class Solution:    
    def Rearrange(self, arr):
        arr.sort()
        ans = []
        l, r = 0, len(arr) - 1

        while l <= r:
            if l == r:
                ans.append(arr[l])
            else:
                ans.append(arr[l])
                ans.append(arr[r])
            l += 1
            r -= 1

        return ans
