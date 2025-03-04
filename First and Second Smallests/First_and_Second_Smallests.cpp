class Solution {
  public:
    vector<int> minAnd2ndMin(vector<int> &arr) {
        int first =INT_MAX,second = INT_MAX;
        int n = arr.size();
        for(int i = 0; i<n; i++) {
            if(first > arr[i]) {
                second = first;
                first = arr[i];
            }
            else if(first < arr[i] && second > arr[i]) {
                second = arr[i];
            }
        }
        if(first == INT_MAX || second == INT_MAX) return {-1};
        return {first,second};
    }
};