class Solution {

  public:
    void leftRotate(vector<int>& arr, int k) {
        vector<int> temp = arr;
        int n = arr.size();
        k = k%n;
        if(k == 0) return;
        for(int i = 0; i<n; i++) {
            arr[i] = temp[(i+k)%n];
        }
        return;
    }
};