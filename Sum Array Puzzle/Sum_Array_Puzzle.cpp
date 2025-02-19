class Solution {
  public:

    void sumArray(vector<int> &arr) {
        // 1st solution
        
        // int sum = 0;
        // for(auto i: arr) {
        //     sum += i;
        // }
        // for(auto &i: arr) {
        //     i = sum-i;
        // }
        // return;
        
        
        
        // 2nd solution
        
        int n = arr.size();
        vector<int> prefix(n,0), suffix(n,0);
        int sum =0;
        for(int i =0; i<n; i++) {
            prefix[i] = sum;
            sum += arr[i];
        }
        sum =0;
        for(int i =n-1; i>=0; i--) {
            suffix[i] =sum;
            sum += arr[i];
        }
        for(int i =0; i<n; i++) {
            arr[i] = prefix[i]+suffix[i];
        }
        return;
    }
};