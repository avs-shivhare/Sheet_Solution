class Solution {
  public:
    vector<int> Rearrange(vector<int> arr) {
        sort(arr.begin(),arr.end());
        vector<int> ans;
        int l =0,r = arr.size()-1;
        while(l<=r) {
            if(l == r) {
                ans.push_back(arr[l]);
            }
            else {
                ans.push_back(arr[l]);
                ans.push_back(arr[r]);
            }
            l++;
            r--;
        } 
        return ans;
    }
};