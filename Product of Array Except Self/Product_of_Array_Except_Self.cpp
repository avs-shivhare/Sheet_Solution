class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> prefix(n,0),suffix(n,0);
        int product = 1;
        for(int i =0;i<n; i++) {
            prefix[i] = product;
            product *=nums[i];
        }
        product = 1;
        for(int i =n-1; i>=0; i--) {
            suffix[i] = product;
            product *= nums[i];
        }
        vector<int> ans(n,0);
        for(int i =0; i<n; i++) {
            ans[i] = prefix[i]*suffix[i];
        }
        return ans;
    }
};