class Solution {
public:
    string largestNumber(vector<int>& nums) {
        sort(nums.begin(),nums.end(),[&](int a,int b) {
            string x = to_string(a);
            string y = to_string(b);\
            string xx = x+y;
            string yy = y+x;
            if(xx > yy) return true;
            return false;
        });
        
        string ans = "";
        for(auto i: nums) {
            ans += to_string(i);
        }
        while(ans.size() > 1 && ans[0] == ans[1] && ans[0] == '0') {
            ans.erase(0,1);
        }
        return ans;
    }
};