class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        Map<Character, Integer> mpp = new HashMap<>(), mpp2 = new HashMap<>();
        for (char c : word1.toCharArray()) {
            mpp.put(c, mpp.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            mpp2.put(c, mpp2.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : mpp.entrySet()) {
            if (Math.abs(entry.getValue() - mpp2.getOrDefault(entry.getKey(), 0)) > 3) {
                return false;
            }
            mpp.put(entry.getKey(),0);
            mpp2.put(entry.getKey(), 0);
        }
        for (Map.Entry<Character, Integer> entry : mpp2.entrySet()) {
            if (Math.abs(entry.getValue() - mpp.getOrDefault(entry.getKey(), 0)) > 3) {
                return false;
            }
        }
        return true;
    }
}