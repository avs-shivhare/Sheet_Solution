class Solution {
    static String triDownwards(String s){
        // in this problem we have to replace character with dot(.)
        int n = s.length();
        String ans = "";
        for(int i =0; i<n; i++) {
            // add dot(.) first;
            for(int j =0; j<i; j++) {
                ans += ".";
            }
            // add remain character
            for(int j =i; j<n; j++) {
                ans += s.charAt(j);
            }
        }
        return ans;
    }
};