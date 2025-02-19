class Solution {
public:
    static bool compare(pair<int,int> &t1,pair<int,int> &t2) {
        if(t1.second > t2.second) return true;
        return false;
    }
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> mpp;
        for(auto i: nums) {
            mpp[i]++;
        }
        vector<pair<int,int>> temp;
        for(auto i: mpp) {
            temp.push_back({i.first,i.second});
        }
        sort(temp.begin(),temp.end(),compare);
        vector<int> ans;
        for(int i=0;i<k; i++) {
            ans.push_back(temp[i].first);
        }
        return ans;
    }
};