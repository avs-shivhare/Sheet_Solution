class Solution {
  public:
    void printTriangle(int n) {
        for(int i =1; i<=n; i++) {
            for(int j =1; j<=i; j++) {
                cout<<j<<" ";
            }
            for(int j = n-i; j>0; j--) {
                cout<<"  ";
            }
            for(int j = n-i; j>0; j--) {
                cout<<"  ";
            }
            for(int j = i; j>0; j--) {
                cout<<j<<" ";
            }
            cout<<endl;
        }
    }
};