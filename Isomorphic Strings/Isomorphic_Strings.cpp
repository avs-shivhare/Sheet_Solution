class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char,char> mpp,mpp2;
        int n = s.size();
        for(int i = 0; i<n; i++) {
            if(mpp.count(s[i])) {
                if(mpp[s[i]] != t[i]) return false;
            }
            if(mpp2.count(t[i])) {
                if(mpp2[t[i]] != s[i]) return false;
            }
            mpp[s[i]] = t[i];
            mpp2[t[i]] = s[i];
        }
        return true;
    }
};