class Solution {
  public:
    int findMaxProduct(vector<int>& arr, int k) {
        int ans = 0;
        int l =0,r = 0;
        int n = arr.size();
        int product = 1;
        while(r<n) {
            product *= arr[r];
            while(l<=r && r-l+1 >k) {
                product /= arr[l];
                l++;
            }
            if(r-l+1 == k) ans = max(ans,product);
            r++;
        }
        return ans;
    }
};
