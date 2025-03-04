class Solution {
  public:
    pair<int, int> countOddEven(vector<int> &arr) {
        int odd = 0,even = 0;
        int n = arr.size();
        for(int i = 0; i<n; i++) {
            if(arr[i]%2 == 1) odd++;
            else even++;
        }
        return {odd,even};
    }
};