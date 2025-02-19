class Solution {
  public:
    vector<string> yShapedPattern(int n) {
        int left = 1,right = n+1;
        vector<string> ans;
        for(int i =1; i<=n; i++) {
            string temp = "";
            for(int j = 1; j<=n+1; j++) {
                if(j == left || j == right) {
                    temp += "*";
                }
                else temp += " ";
            }
            if(left < right) {
                left++;
                right--;
            }
            ans.push_back(temp);
        }
        return ans;
    }
};