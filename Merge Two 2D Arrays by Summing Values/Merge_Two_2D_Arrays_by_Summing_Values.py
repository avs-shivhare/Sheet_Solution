class Solution:
    def mergeArrays(self, nums1: List[List[int]], nums2: List[List[int]]) -> List[List[int]]:
        ans = []
        i = j = 0
        n, m = len(nums1), len(nums2)
        
        while i < n and j < m:
            if nums1[i][0] < nums2[j][0]:
                current = nums1[i]
                i += 1
            else:
                current = nums2[j]
                j += 1
            if ans and ans[-1][0] == current[0]:
                ans[-1][1] += current[1]
            else:
                ans.append([current[0], current[1]])
        
        while i < n:
            current = nums1[i]
            if ans and ans[-1][0] == current[0]:
                ans[-1][1] += current[1]
            else:
                ans.append([current[0], current[1]])
            i += 1
        
        while j < m:
            current = nums2[j]
            if ans and ans[-1][0] == current[0]:
                ans[-1][1] += current[1]
            else:
                ans.append([current[0], current[1]])
            j += 1
        
        return ans
        