class Solution {
  public:
    int calculateFriendliness(vector<int>& arr) {
        int ans =0;
        int n = arr.size();
        for(int i =1;i<n; i++) {
            ans += abs(arr[i]-arr[i-1]);
        }
        ans += abs(arr[0]-arr[n-1]);
        return ans;
    }
};
