class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        unordered_set<int> st;
        for(auto i: nums) {
            st.insert(i);
        }
        int n = nums.size();
        for(int i =1; i<=n; i++) {
            if(st.count(i) == 0) return i;
        }
        return n+1;
    }
};