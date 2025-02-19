class Solution {
  public:
    int multiply(vector<int> &arr) {
        int n = arr.size();
        int sum1 =0,sum2 =0;
        for(int i =0; i<n; i++) {
            if(i<n/2) sum1+= arr[i];
            else sum2+=arr[i];
        }
        return sum1*sum2;
    }
};
