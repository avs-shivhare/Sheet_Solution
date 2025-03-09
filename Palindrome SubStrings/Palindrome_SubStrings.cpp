class Solution {
  public:
    int countPS(string &s) {
        int ans = 0;
        int n = s.size();
        for(int i = 0; i<n; i++) {
            int left = i,right = i;
            // for odd length palindrome substring
            while(left >=0 && right < n && s[left] == s[right]) {
                if(right-left+1 >= 2) {
                    ans++;
                } 
                left--;
                right++;
            }
            // for even length palindrome substring
            left = i;
            right = i+1;
            while(left >= 0 && right < n && s[left] == s[right]) {
                if(right-left+1 >=2) {
                    ans++;
                }
                left--;
                right++;
            }
        }
        return ans;
    }
};