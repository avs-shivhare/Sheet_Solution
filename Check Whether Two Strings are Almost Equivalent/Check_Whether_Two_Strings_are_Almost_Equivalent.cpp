class Solution {
public:
    bool checkAlmostEquivalent(string word1, string word2) {
        unordered_map<char,int> mpp,mpp2;
        for(auto i: word1) {
            mpp[i]++;
        }
        for(auto i: word2) {
            mpp2[i]++;
        }
        for(auto &i: mpp) {
            if(abs(i.second-mpp2[i.first]) > 3) return false;
            i.second = 0;
            mpp2[i.first] = 0;
        }
        for(auto i: mpp2) {
            if(abs(i.second-mpp[i.first]) > 3) return false;
        }
        return true;
    }
};