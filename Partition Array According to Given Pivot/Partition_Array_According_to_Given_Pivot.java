class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i<n; i++) {
            if(nums[i] < pivot) {
                less.add(nums[i]);
            }
            else if(nums[i] > pivot) {
                greater.add(nums[i]);
            }
            else {
                equal.add(nums[i]);
            }
        }
        int eq = equal.size();
        int ls = less.size();
        int gr = greater.size();
        int ans[] = new int[n];
        int j = 0;
        for(int i = 0; i<ls; i++) {
            ans[j] = less.get(i);
            j++;
        }
        for(int i = 0; i<eq; i++) {
            ans[j] = equal.get(i);
            j++;
        }
        for(int i = 0; i<gr; i++) {
            ans[j] = greater.get(i);
            j++;
        }
        return ans;
    }
}