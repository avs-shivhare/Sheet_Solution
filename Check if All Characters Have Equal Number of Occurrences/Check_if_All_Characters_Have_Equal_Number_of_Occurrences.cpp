class Solution {
public:
    bool areOccurrencesEqual(string s) {
        unordered_map<char,int> mpp;
        int maxi = 0;
        for(auto i: s) {
            mpp[i]++;
            maxi = max(maxi,mpp[i]);
        }
        for(auto i: mpp) {
            if(maxi != i.second) return false;
        }
        return true;
    }
};