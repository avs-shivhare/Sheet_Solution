class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        int first =Integer.MAX_VALUE,second = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i = 0; i<n; i++) {
            if(first > arr[i]) {
                second = first;
                first = arr[i];
            }
            else if(first < arr[i] && second > arr[i]) {
                second = arr[i];
            }
        }
        if(first == Integer.MAX_VALUE || second == Integer.MAX_VALUE) return new int[]{-1};
        return new int[]{first,second};
    }
}