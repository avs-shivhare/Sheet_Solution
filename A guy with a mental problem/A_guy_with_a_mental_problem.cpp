class Solution {
  public:
    int minTime(vector<int>& arr1, vector<int>& arr2) {
        bool flag = true;
        int sum1 =arr1[0],sum2 = arr2[0];
        int n = arr1.size();
        for(int i =1; i<n; i++) {
            if(flag) {
                sum1 += arr2[i];
                sum2 += arr1[i];
            }
            else {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            flag = !flag;
        }
        return min(sum1,sum2);
    }
};