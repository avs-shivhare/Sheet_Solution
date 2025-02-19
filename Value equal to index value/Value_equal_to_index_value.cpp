class Solution {
  public:
    
    vector<int> valueEqualToIndex(vector<int>& arr) {
        vector<int> ans;
        int n = arr.size();
        for(int i =1; i<=n; i++) {
            if(arr[i-1] == i) ans.push_back(arr[i-1]);
        }
        return ans;
    }
};