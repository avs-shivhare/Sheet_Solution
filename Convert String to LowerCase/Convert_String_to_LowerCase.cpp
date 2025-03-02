class Solution {
  public:
    string toLower(string& s) {
        for(auto &i: s) {
            i = tolower(i);
        }
        return s;
    }
};
