class Solution {
  public:
    bool check(string s,string x) {
        int n = s.size();
        int m = x.size();
        int i = 0,j = 0;
        int cnt = 0;
        while(i<n && j<m) {
            if(s[i] == x[j]) {
                i++;
                j++;
            }
            else {
                i++;
                cnt++;
            }
        }
        if(j<m) return false;
        while(i<n) {
            i++;
            cnt++;
        }
        return cnt == 1;
    }
    int longestStringChain(vector<string>& words) {
        map<int,vector<pair<string,int>>> mpp;
        for(auto i: words) {
            mpp[i.size()].push_back({i,1});
        }
        int ans = 0;
        for(auto &i: mpp) {
            for(auto &x: i.second) {
                for(auto j: mpp[i.first-1]) {
                    if(check(x.first,j.first)) {
                        x.second = max(j.second+1,x.second);
                    }
                }
                ans = max(ans,x.second);
            }
        }
        return ans;
    }
};