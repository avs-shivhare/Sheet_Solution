class Solution {
  public:
    void printTriangle(int n) {
        // same as previous question
        // in each row have element that is equal to 2*i+1
        // in zero based indexing
        // haft +1 character are increase and remaing are decreasing
        for(int i =0; i<n; i++) {
            // spaces
            for(int j = n-1; j>i; j--) {
                cout<<" ";
            }
            char el = 'A';
            // character
            for(int j =0; j<2*i+1; j++) {
                cout<<el;
                if(j<i) el++;
                else el--;
            }
            cout<<endl;
        }
    }
};
