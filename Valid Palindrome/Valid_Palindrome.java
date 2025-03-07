class Solution {
    public boolean isPalindrome(String s) {
        String ans = "";
        int n = s.length();
        for(int i = 0; i<n; i++) {
            char x = Character.toLowerCase(s.charAt(i));
            if('0' <= x && x <= '9') {
                ans += x;
            }
            else if('a' <= x && x <= 'z') {
                ans += x;
            }
        }
        int left = 0,right = ans.length()-1;
        while(left < right) {
            if(ans.charAt(left) != ans.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}