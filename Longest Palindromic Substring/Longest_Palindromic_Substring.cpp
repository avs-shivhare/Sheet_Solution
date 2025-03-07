class Solution {
public:
    string longestPalindrome(string s) {
        int start = 0;
        int len = 0;
        int n = s.size();
        for(int i = 0; i<n; i++) {
            int left = i, right = i;
            // for odd length palindrome
            while(left >= 0 && right < n && s[left] == s[right]) {
                if(right-left+1 > len) {
                    len = right-left+1;
                    start = left;
                }
                left--;
                right++;
            }
            // for even length palindrome
            left = i,right = i+1;
            while(left >=0 && right < n && s[left] == s[right]) {
                if(right-left+1 > len) {
                    len = right-left+1;
                    start = left;
                }
                left--;
                right++;
            }
            
        }
        return s.substr(start,len);
    }
};