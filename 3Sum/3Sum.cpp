class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int n = nums.size();
        set<vector<int>> st;
        int i =0;
        while(i<n) {
            int j = 0,k = n-1;
            while(j<k) {
                if(j == i) {
                    j++;
                    continue;
                }
                else if(i == k) {
                    k--;
                    continue;
                }
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0) {
                    vector<int> temp= {nums[i],nums[j],nums[k]};
                    sort(temp.begin(),temp.end());
                    st.insert(temp);
                    j++;
                    k--;
                }
                else if(sum > 0) k--;
                else j++;
            }
            int temp = nums[i];
            while(i<n && nums[i] == temp) i++;
        }
        vector<vector<int>> ans;
        for(auto i: st) {
            ans.push_back(i);
        }
        return ans;
    }
};