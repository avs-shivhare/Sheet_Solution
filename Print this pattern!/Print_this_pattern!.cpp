class Solution
{
public:
    void printPattern(int n)
    {   
        
        for(int i =n; i>0; i--) {
            string temp = "";
            for(int j =n; j>0; j--) {
                if(j>=i) temp += to_string(j);
                else temp += to_string(i);
            }
            string tt = temp;
            reverse(temp.begin(),temp.end());
            cout<<tt.substr(0,tt.size()-1)<<temp<<endl;
        }
        
        for(int i = 2; i<=n; i++) {
            string temp = "";
            for(int j =n; j>0; j--) {
                if(j>=i) temp += to_string(j);
                else temp += to_string(i);
            }
            string tt = temp;
            reverse(temp.begin(),temp.end());
            cout<<tt.substr(0,tt.size()-1)<<temp<<endl;
        }
    }
};
