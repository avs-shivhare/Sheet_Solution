class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> mpp = new TreeMap<>();
        for(int i: nums) {
            mpp.put(i,1);
        }
        int ans = 0;
        for(int i : mpp.keySet()) {
            if(mpp.containsKey(i-1)) {
                mpp.put(i,mpp.get(i-1)+1);
            }
            ans = Math.max(ans,mpp.get(i));
        }
        return ans;
    }
}