class Solution {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        int ans = 0;
        for(int i = 0; i<n; i++) {
            int fre[] = new int[26];
            for(int j = i; j<n; j++) {
                char sj = s.charAt(j);
                fre[sj-'a']++;
                boolean flag = true;
                for(int x = 0; x<26; x++) {
                    if(fre[x] > 0) {
                        if(fre[x] < k) {
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag) {
                    ans = Math.max(ans,j-i+1);
                }
            }
            
        }
        return ans;
    }
}