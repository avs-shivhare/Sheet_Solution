class Solution {
  public:
    
    vector<int> countOddEven(vector<int> &arr) {
        int odd =0,even = 0;
        for(auto i: arr) {
            if(i%2 == 0) even++;
            else odd++;
        }
        return {odd,even};
    }
};