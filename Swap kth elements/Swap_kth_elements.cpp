class Solution {
  public:
    void swapKth(int k, vector<int> &arr) {
        swap(arr[k-1],arr[arr.size()-k]);
        return;
    }
};