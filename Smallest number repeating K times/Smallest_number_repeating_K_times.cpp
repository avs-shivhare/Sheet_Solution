class Solution {
  public:
    int findDuplicate(const vector<int>& arr, int k) {
        unordered_map<int,int> mpp;
        for(auto i: arr) {
            mpp[i]++;
        }
        int ans = 1e9;
        for(auto i: mpp) {
            if(i.second == k && ans > i.first) {
                ans = i.first;
            }
        }
        if(ans == 1e9) return -1;
        return ans;
    }
};