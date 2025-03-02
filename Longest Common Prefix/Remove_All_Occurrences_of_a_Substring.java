class Solution {
    public String longestCommonPrefix(String[] strs) {
        HashMap<String,Integer> mpp = new HashMap<>();
        int n = strs.length;
        for(String i: strs) {
            for(int j = 0; j<i.length(); j++) {
                String temp = i.substring(0,j+1);
                int cnt = mpp.getOrDefault(temp,0);
                mpp.put(temp,cnt+1);
            }
        }
        String ans = "";
        for(Map.Entry<String,Integer> i: mpp.entrySet()) {
            if(i.getValue() == n) {
                if(ans.length() < i.getKey().length()) {
                    ans = i.getKey();
                }
            }
        }
        return ans;
    }
}