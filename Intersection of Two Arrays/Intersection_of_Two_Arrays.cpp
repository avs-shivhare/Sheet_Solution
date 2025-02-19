class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> st,st2;
        for(auto i: nums1) {
            st.insert(i);
        }
        for(auto i: nums2) {
            st2.insert(i);
        }
        vector<int> ans;
        for(auto i: st2) {
            if(st.count(i)) ans.push_back(i);
        }
        return ans;
    }
};