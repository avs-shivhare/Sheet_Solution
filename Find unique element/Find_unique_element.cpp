class Solution {
  public:
    int findUnique(int k, vector<int>& arr) {
        unordered_map<int,int> mpp;
        for(auto i: arr) {
            mpp[i]++;
        }
        for(auto i: mpp) {
            if(i.second%k != 0) return i.first;
        }
        return -1;
    }
};