class Solution {
public:
    string reverseWords(string s) {
        stringstream ss(s);
        string temp;
        vector<string> arr;
        while(ss>>temp) {
            arr.push_back(temp);
        }
        reverse(arr.begin(),arr.end());
        string ans = "";
        for(auto i: arr) {
            ans += i+" ";
        }
        ans.pop_back();
        return ans;
    }
};