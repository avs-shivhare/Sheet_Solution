class Solution {
  public:
    int maxNtype(vector<int>& arr) {
        int inc =0,dec = 0;
        int n = arr.size();
        for(int i =1; i<n; i++) {
            if(arr[i-1]<=arr[i]) inc++;
            else dec++;
        }
        if(inc == 0) return 2;
        else if(dec == 0) return 1;
        else if(dec > inc) return 3;
        return 4;
    }
};