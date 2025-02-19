class Solution {
    public String longest(List<String> names) {
        String ans = "";
        for (String i : names) {
            if (ans.length() < i.length()) {
                ans = i;
            }
        }
        return ans;
    }
}