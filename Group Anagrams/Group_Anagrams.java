class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mpp = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            mpp.putIfAbsent(sortedStr, new ArrayList<>());
            mpp.get(sortedStr).add(s);
        }
        return new ArrayList<>(mpp.values());
    }
}