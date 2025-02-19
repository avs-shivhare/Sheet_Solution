class Solution
{
public:
    void printPattern(int n)
    {
        // outer loop for print n asterisk(*)
        for(int i =1; i<=n; i++) {
            //inner loop which print i asterisk(*) 
            for(int j =1; j<=i; j++) {
                cout<<"*";
            }
            // space
            cout<<" ";
        }
    }
};