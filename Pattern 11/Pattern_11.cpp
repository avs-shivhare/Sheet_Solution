class Solution {
  public:
    void printTriangle(int n) {
        // in this pattern 
        // if row no. is even in zero based indexing then 
        // element start with 1
        // otherwise 0
        // and change alternative
        for(int i =0; i<n; i++) {
            bool flag = false;
            if(i%2 == 0) flag = true;
            for(int j =0; j<=i; j++) {
                if(flag) cout<<"1 ";
                else cout<<"0 ";
                flag = !flag;
            }
            cout<<endl;
        }
    }
};