class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int first = 0, second = 0, cnt1 = 0, cnt2 = 0;
        for (int i : nums) {
            if (i == first) {
                cnt1++;
            } else if (i == second) {
                cnt2++;
            } else if (cnt1 == 0) {
                first = i;
                cnt1 = 1;
            } else if (cnt2 == 0) {
                second = i;
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for (int i : nums) {
            if (i == first) cnt1++;
            else if (i == second) cnt2++;
        }
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        if (cnt1 > n / 3) ans.add(first);
        if (cnt2 > n / 3) ans.add(second);
        return ans;
    }
}