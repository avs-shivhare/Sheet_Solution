class Solution {
public:
    int longestSubstring(string s, int k) {
        int n = s.size();
        int ans = 0;
        for(int i = 0; i<n; i++) {
            vector<int> fre(26,0);
            for(int j = i; j<n; j++) {
                fre[s[j]-'a']++;
                bool flag = true;
                for(int x = 0; x<26; x++) {
                    if(fre[x] > 0) {
                        if(fre[x] < k) {
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag) {
                    ans = max(ans,j-i+1);
                }
            }
            
        }
        return ans;
    }
};