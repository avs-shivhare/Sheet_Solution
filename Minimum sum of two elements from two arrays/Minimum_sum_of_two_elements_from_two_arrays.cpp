class Solution {
  public:
    vector<int> minimum(vector<int> &arr) {
        int mini = 1e9,second_mini = 1e9;
        int minIndex = -1,second_miniIndex = -1;
        int n = arr.size();
        for(int i =0; i<n; i++) {
            if(mini > arr[i]) {
                second_mini = mini;
                second_miniIndex = minIndex;
                mini = arr[i];
                minIndex = i;
            }
            else if(second_mini > arr[i]) {
                second_mini = arr[i];
                second_miniIndex = i;
            }
        }
        return {mini,second_mini,minIndex,second_miniIndex};
    }
    int minSum(vector<int>& arr1, vector<int>& arr2) {
        
        auto x = minimum(arr1);
        auto y = minimum(arr2);
        int ans = 1e9;
        if(x[2] != y[2]) return x[0]+y[0];
        else if((arr1.size() == 1 && arr2.size() > 1) || (arr2.size() == 1 && arr1.size() > 1)) return min(x[0],y[0]);
        if(x[3] != -1) {
            ans = min(ans,y[0]+x[1]);
        }
        if(y[3] != -1) ans = min(ans,x[0]+y[1]);
        if(ans == 1e9) return INT_MIN;
        return ans;
    }
};