class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> mpp = new HashMap<>(), mpp2 = new HashMap<>();
        for (String word : words1) {
            mpp.put(word, mpp.getOrDefault(word, 0) + 1);
        }
        for (String word : words2) {
            mpp2.put(word, mpp2.getOrDefault(word, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<String, Integer> entry : mpp.entrySet()) {
            if (entry.getValue() == 1 && mpp2.getOrDefault(entry.getKey(), 0) == 1) {
                ans++;
            }
        }
        return ans;
    }
}