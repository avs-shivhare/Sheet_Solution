class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        int XOR = 0;
        for(auto i: nums) {
            XOR ^= i;
        }
        int x = 0;
        for(x = 0; x<32; x++) {
            if(XOR & (1<<x)) {
                break;
            }
        }
        int first =0,second = 0;
        for(auto i: nums) {
            if(i & (1<<x)) {
                first ^= i;
            }
            else {
                second ^= i;
            }
        }
        return {first,second};
    }
};