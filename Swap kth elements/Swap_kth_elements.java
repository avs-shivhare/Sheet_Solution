class Solution {
    public void swapKth(int k, List<Integer> arr) {
        int n = arr.size();
        int temp = arr.get(k-1);
        arr.set(k-1, arr.get(n-k));
        arr.set(n-k, temp);
    }
}