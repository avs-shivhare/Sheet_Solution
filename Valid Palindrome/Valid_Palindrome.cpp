class Solution {
public:
    bool isPalindrome(string s) {
        string ans = "";
        int n = s.size();
        for(int i = 0; i<n; i++) {
            char x = tolower(s[i]);
            if('0' <= x && x <= '9') {
                ans += x;
            }
            else if('a' <= x && x <= 'z') {
                ans += x;
            }
        }
        int left = 0,right = ans.size()-1;
        while(left < right) {
            if(ans[left] != ans[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
};