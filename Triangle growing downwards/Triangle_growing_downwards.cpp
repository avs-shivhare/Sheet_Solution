class Solution
{
public:
    void printTriangleDownwards(string str)
    {
        int n = str.size();
        for(int i =0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                cout<<".";
            }
            for(int j = 0; j<=i; j++) {
                cout<<str[j];
            }
            cout<<endl;
        }
    }
};