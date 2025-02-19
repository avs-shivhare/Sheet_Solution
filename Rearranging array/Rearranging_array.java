class Solution {
    public static ArrayList<Integer> Rearrange(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        int l = 0, r = arr.length- 1;

        while (l <= r) {
            if (l == r) {
                ans.add(arr[l]);
            } else {
                ans.add(arr[l]);
                ans.add(arr[r]);
            }
            l++;
            r--;
        }
        return ans;
    }
}