from typing import List


class Solution:
    def largest(self, arr : List[int]) -> int:
        maxi = float('-inf')
        for i in arr:
            maxi = max(maxi, i)
        return maxi
        

