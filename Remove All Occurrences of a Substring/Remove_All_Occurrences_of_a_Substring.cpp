class Solution {
public:
    string removeOccurrences(string s, string part) {
        int ind = s.find(part);
        int n = part.size();
        while(ind != string::npos) {
            s.erase(ind,n);
            ind = s.find(part);
        }
        return s;
    }
};