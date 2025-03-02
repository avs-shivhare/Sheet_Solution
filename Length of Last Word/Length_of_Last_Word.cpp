class Solution {
public:
    int lengthOfLastWord(string s) {
        stringstream ss(s);
        string temp;
        int ans = 0;
        while(ss>>temp) {
            ans = temp.size();
        }
        return ans;
    }
};