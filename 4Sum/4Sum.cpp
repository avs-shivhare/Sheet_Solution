class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        vector<vector<int>> ans;
        sort(nums.begin(),nums.end());
        int n = nums.size();
        int i =0;
        while(i<n) {
            while(i>0 && i<n &&  nums[i] == nums[i-1]) i++;
            int j = i+1;
            while(j<n) {
                
                int x = j+1,y = n-1;
                while(x<y) {
                    long long sum = (long long)nums[i]+(long long)nums[j]+(long long)nums[x]+(long long)nums[y];    
                    if(sum == target) {
                        
                        ans.push_back({nums[i],nums[j],nums[x],nums[y]});
                        x++;
                        y--;
                        while(x<y && nums[x] == nums[x-1]) x++;
                        while(x<y && nums[y] ==nums[y+1]) y--;
                    }
                    else if(sum < target) {
                        x++;
                    }
                    else y--;
                }
                j++;
                while(j<n && nums[j] == nums[j-1]) j++;
            }
            i++;
        }
        return ans;
    }
};