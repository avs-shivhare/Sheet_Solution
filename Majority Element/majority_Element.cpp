class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int element = 0,cnt =0;
        for(auto i: nums) {
            if(element == i) cnt++;
            else cnt--;
            if(cnt <= 0) {
                element = i;
                cnt = 1;
            }
        }
        return element;
    }
};