class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        int first = 0,second =0,cnt1 =0,cnt2 =0;
        for(auto i: nums) {
            if(first == i) cnt1++;
            else if(second == i) cnt2++;
            else if(cnt1 == 0) {
                first = i;
                cnt1 =1;
            }
            else if(cnt2 == 0) {
                second = i;
                cnt2 =1;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 =0;
        cnt2 =0;
        for(auto i: nums) {
            if(first == i) cnt1++;
            else if(second == i) cnt2++;
        }
        int n = nums.size();
        vector<int> ans;
        if(cnt1 > n/3) ans.push_back(first);
        if(cnt2 > n/3) ans.push_back(second);
        return ans;
    }
};