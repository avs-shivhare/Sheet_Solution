class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder str = new StringBuilder(s);
        int left = 0,right = str.length()-1;
        while(left < right) {
            char l = str.charAt(left);
            char r = str.charAt(right);
            str.setCharAt(left,r);
            str.setCharAt(right,l);
            left++;
            right--;
        }
        return str.toString();
    }
}