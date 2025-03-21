class Pair<K, V> {
    private final K key;
    private final V value;
    
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public K getKey() {
        return key;
    }
    
    public V getValue() {
        return value;
    }
}

class Solution {
    private boolean check(String s, String x) {
        int n = s.length();
        int m = x.length();
        int i = 0, j = 0, cnt = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == x.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
                cnt++;
            }
        }
        if (j < m) return false;
        while (i < n) {
            i++;
            cnt++;
        }
        return cnt == 1;
    }
    
    public int longestStringChain(String words[]) {
        Map<Integer, List<String>> mpp = new HashMap<>();
        Map<String, Integer> dp = new HashMap<>();
        for (String word : words) {
            mpp.putIfAbsent(word.length(), new ArrayList<>());
            mpp.get(word.length()).add(word);
            dp.put(word, 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, List<String>> entry : mpp.entrySet()) {
            for (String x : entry.getValue()) {
                for (String j : mpp.getOrDefault(entry.getKey() - 1, new ArrayList<>())) {
                    if (check(x, j)) {
                        dp.put(x, Math.max(dp.get(j) + 1, dp.get(x)));
                    }
                }
                ans = Math.max(ans, dp.get(x));
            }
        }
        return ans;
    }
}