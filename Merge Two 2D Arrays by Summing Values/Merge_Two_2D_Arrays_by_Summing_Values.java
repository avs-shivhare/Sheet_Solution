class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> ans = new ArrayList<>();
        int i = 0, j = 0;
        int n = nums1.length, m = nums2.length;
        while (i < n && j < m) {
            if (nums1[i][0] < nums2[j][0]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1)[0] < nums1[i][0]) {
                    ans.add(new int[]{nums1[i][0], nums1[i][1]});
                } else {
                    ans.get(ans.size() - 1)[1] += nums1[i][1];
                }
                i++;
            } else {
                if (ans.isEmpty() || ans.get(ans.size() - 1)[0] < nums2[j][0]) {
                    ans.add(new int[]{nums2[j][0], nums2[j][1]});
                } else {
                    ans.get(ans.size() - 1)[1] += nums2[j][1];
                }
                j++;
            }
        }
        while (i < n) {
            if (ans.isEmpty() || ans.get(ans.size() - 1)[0] < nums1[i][0]) {
                ans.add(new int[]{nums1[i][0], nums1[i][1]});
            } else {
                ans.get(ans.size() - 1)[1] += nums1[i][1];
            }
            i++;
        }
        while (j < m) {
            if (ans.isEmpty() || ans.get(ans.size() - 1)[0] < nums2[j][0]) {
                ans.add(new int[]{nums2[j][0], nums2[j][1]});
            } else {
                ans.get(ans.size() - 1)[1] += nums2[j][1];
            }
            j++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}