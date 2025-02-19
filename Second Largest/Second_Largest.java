class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest && i < largest) {
                secondLargest = i;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) return -1;
        return secondLargest;
    }
}