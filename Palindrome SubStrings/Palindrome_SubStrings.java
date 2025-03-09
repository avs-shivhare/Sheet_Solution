class Solution {
    public int countPS(String s) {
        int ans = 0;
        int n = s.length();
        for(int i = 0; i<n; i++) {
            int left = i,right = i;
            // for odd length palindrome substring
            while(left >=0 && right < n && s.charAt(left) == s.charAt(right)) {
                if(right-left+1 >= 2) {
                    ans++;
                } 
                left--;
                right++;
            }
            // for even length palindrome substring
            left = i;
            right = i+1;
            while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if(right-left+1 >=2) {
                    ans++;
                }
                left--;
                right++;
            }
        }
        return ans;
    }
}