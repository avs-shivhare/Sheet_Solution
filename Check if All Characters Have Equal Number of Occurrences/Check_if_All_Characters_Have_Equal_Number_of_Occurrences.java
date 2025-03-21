class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> mpp = new HashMap<>();
        int maxi = 0;
        for (char c : s.toCharArray()) {
            mpp.put(c, mpp.getOrDefault(c, 0) + 1);
            maxi = Math.max(maxi, mpp.get(c));
        }
        for (int count : mpp.values()) {
            if (maxi != count) {
                return false;
            }
        }
        return true;
    }
}