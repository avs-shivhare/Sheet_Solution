class Solution {

    public static int compare(Map.Entry<Integer, Integer> t1, Map.Entry<Integer, Integer> t2) {
        return t2.getValue() - t1.getValue();
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i : nums) {
            mpp.put(i, mpp.getOrDefault(i, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> temp = new ArrayList<>(mpp.entrySet());
        temp.sort(Solution::compare);
        
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = temp.get(i).getKey();
        }
        return ans;
        
    }
}