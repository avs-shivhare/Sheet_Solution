class Solution {
  public:
    pair<long long, long long> getMinMax(vector<long long int> arr) {
        long long mini = 1e18,maxi =0;
        for(auto i: arr) {
            mini = min(mini,i);
            maxi = max(maxi,i);
        }
        return {mini,maxi};
    }
};