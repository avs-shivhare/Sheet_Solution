class Solution {
  public:
    void printDiamond(int n) {
        for(int i =1; i<=n; i++) {
            for(int j = 1; j<=n-i; j++) {
                cout<<" ";
            }
            for(int j =1; j<=i; j++) {
                cout<<"* ";
            }
            cout<<endl;
        }
        
        for(int i =n; i>0; i--) {
            for(int j = 1; j<=n-i; j++) {
                cout<<" ";
            }
            for(int j =1; j<=i; j++) {
                cout<<"* ";
            }
            cout<<endl;
        }
    }
};
