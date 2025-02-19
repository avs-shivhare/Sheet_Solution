class Solution {
    public static int maxProduct(int[] arr) {
        // 1st method
        // we can solve this question by sorting the give array
        // and multiply last to number
        // which mean after sorting, return product of 
        // n-1th and n-2th element
        // but its time complexity is O(nlogn)
        // and space complexity is O(1)
        
        
        // solution
        // Arrays.sort(arr);
        // int n = arr.length;
        // return (int)((long)arr[n - 1] * (long)arr[n - 2]);
        
        
        // 2nd method 
        // find the largest and second largest and multiply that
        // finding largest and second largest element are done in O(n)
        // so the time complexity of this solution is O(n)
        // and space complexity is O(1)
        
        
        // solution
        long largest = 0, secondLargest = 0;
        
        // iterating using for each loop
        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest) {
                secondLargest = i;
            }
        }

        return (int)(largest * secondLargest);
    }
}
