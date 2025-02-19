class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        int cnt = 0;
        for (int i : arr) {
            if (i <= x) {
                cnt++;
            }
        }
        return cnt;
    }
}