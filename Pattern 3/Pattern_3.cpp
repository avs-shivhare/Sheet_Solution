class Solution {
  public:
    void printTriangle(int n) {
        // simple pattern if you look of given example you can build logic
        // to solve this pattern
        // in each row no. of element is equal to row number
        // and every element start with 1 and increase by one upto row nu.
        for(int row =1; row<=n; row++) {
            for(int col = 1; col<=row; col++) {
                cout<<col<<" ";
            }
            cout<<endl;
        }
    }
};
