class Solution:
    def getSecondLargest(self, arr):
        largest = float('-inf')
        second_largest = float('-inf')
        
        for i in arr:
            if i > largest:
                second_largest = largest
                largest = i
            elif i > second_largest and i < largest:
                second_largest = i
        
        if second_largest == float('-inf'):
            return -1
        return second_largest
