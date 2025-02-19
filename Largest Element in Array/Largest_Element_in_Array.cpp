class Solution {
  public:
    int largest(vector<int> &arr) {
        int maxi = -1e9;
        for(auto i: arr) {
            maxi = max(maxi,i);
        }
        return maxi;
    }
};