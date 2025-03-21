class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> mpp = new HashMap<>();
        for (char c : s.toCharArray()) {
            mpp.put(c, mpp.getOrDefault(c, 0) + 1);
        }
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (mpp.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}