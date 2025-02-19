class Solution {
  public:
    bool checkIsAP(vector<int> &arr) {
        sort(arr.begin(),arr.end());
        int temp =-1;
        int n = arr.size();
        for(int i =1; i<n; i++) {
            if(temp == -1) {
                temp = abs(arr[i]-arr[i-1]);
            }
            else if(temp != abs(arr[i]-arr[i-1])) return false;
        }
        
        return true;
    }
};
