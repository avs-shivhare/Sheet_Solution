class Solution:

	def maxProduct(self,arr):
    # 	// 1st method
    #     // we can solve this question by sorting the give array
    #     // and multiply last to number
    #     // which mean after sorting, return product of 
    #     // n-1th and n-2th element
    #     // but its time complexity is O(nlogn)
    #     // and space complexity is O(1)
        
        
    #     // solution
        # arr.sort()
        # n = len(arr)
        # return arr[n - 1] * arr[n - 2]
        
        
    #     // 2nd method 
    #     // find the largest and second largest and multiply that
    #     // finding largest and second largest element are done in O(n)
    #     // so the time complexity of this solution is O(n)
    #     // and space complexity is O(1)
        
        
        # // solution
        largest, second_largest = 0, 0
        
        for i in arr:
            if i > largest:
                second_largest = largest
                largest = i
            elif i > second_largest:
                second_largest = i

        return largest * second_largest