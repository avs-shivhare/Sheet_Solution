class Solution {
public:
    string largestNumber(vector<int>& nums) {
        vector<string> arr;
        for(auto i: nums) {
            string x = to_string(i);
            arr.push_back(x);
        }
        sort(arr.begin(),arr.end(),[&](string a,string b) {
            // true, false;
            // true -> a b
            // false -> b a
            string ab = a+b;
            string ba = b+a;
            if(ab > ba) return true;
            else return false;
        });
        string ans = "";
        for(auto i: arr) {
            ans += i;
        }
        if(ans[0] == '0') return "0";
        return ans;
    }
};