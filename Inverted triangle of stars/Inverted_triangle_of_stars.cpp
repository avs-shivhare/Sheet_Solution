class Solution {
  public:
    vector<string> invIsoTriangle(int n) {
        // in this question in one row there are 2*n-1 element
        // and each row have spaces in starting and ending
        // in zero based indexing no. of space are equal to row no.
        vector<string> ans;
        for(int i =0; i<n; i++) {
            string temp = "";
            // space
            for(int j =0; j<i; j++) {
                temp += " ";
            }
            // star
            for(int j = 2*(n-i)-1; j>0; j--) {
                temp += "*";
            }
            // space
            for(int j =0; j<i; j++) {
                temp += " ";
            }
            ans.push_back(temp);
        }
        return ans;
    }
};
