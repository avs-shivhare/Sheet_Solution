class Solution {
    boolean vowel(char x) {
        x = Character.toLowerCase(x);
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') return true;
        return false;
    }
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int left = 0,right = sb.length()-1;
        while(left < right) {
            if(vowel(sb.charAt(left)) && vowel(sb.charAt(right))) {
                char temp = sb.charAt(left);
                sb.setCharAt(left,sb.charAt(right));
                sb.setCharAt(right,temp);
                left++;
                right--;
            }
            else if(vowel(sb.charAt(left))) right--;
            else left++;
        }
        return sb.toString();
    }
}