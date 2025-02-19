class Solution {
  public:
    int sum(vector<int>& arr) {
        // simple question 
        // we have to just add all element 
        // we can do this with linear traversal
        // linear traversal means visit every element
        // one by one and add into total
        int total =0;
        int n = arr.size();
        for(int i =0; i<n; i++) {
            total += arr[i];
        }
        return total;
    }
};