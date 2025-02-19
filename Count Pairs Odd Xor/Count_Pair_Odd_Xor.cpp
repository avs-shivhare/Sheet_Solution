class Solution {
  public:
    long long countOddXorPairs(vector<int>& arr) {
        long long odd =0,even = 0;
        for(auto i: arr) {
            if(i%2 == 0) even++;
            else odd++;
        }
        return odd*even;
    }
};