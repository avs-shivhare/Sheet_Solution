class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string ans = "";
        int n = word1.size();
        int m = word2.size();
        int i = 0,j = 0;
        while(i<n || j<m) {
            if(i<n) {
                ans += word1[i];
                i++;
            }
            if(j<m) {
                ans += word2[j];
                j++;
            }
        }
        return ans;
    }
};