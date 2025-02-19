class Solution {
  public:
    void printSquare(int n) {
        // see the give pattern
        // start is printed only if either row =1, row =n,col =1,col =n
        for(int row =1; row<=n; row++) {
            for(int col =1; col<=n; col++) {
                if(row == 1 || row == n || col == 1 || col == n) {
                    cout<<"*";
                }
                else cout<<" ";
            }
            cout<<endl;
        }
    }
};