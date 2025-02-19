class Solution {
  public:
    void printSquare(int n) {
        // for square pattern we know square are no. of row == no. of column 
        
        // outer loop for iterating on row
        for(int row = 1; row<=n; row++) {
            // inner loop for iterating on column
            for(int col = 1; col<=n; col++) {
                cout<<"* ";
            }
            // print end line
            cout<<endl;
        }
    }
};