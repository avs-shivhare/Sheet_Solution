class Solution:
    def minAnd2ndMin(self, arr):
        first = second = float('inf')
        for i in arr:
            if first > i:
                second = first
                first = i
            elif first < i and second > i:
                second = i
        if first == float('inf') or second == float('inf'): 
            return [-1]
        return [first,second];
        
  