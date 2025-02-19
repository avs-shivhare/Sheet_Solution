class Solution {
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l,
                                                     int r) {
        l--;
        r--;

        while (l < r) {
            Collections.swap(arr, l, r);
            l++;
            r--;
        }
        return arr;
    }
}