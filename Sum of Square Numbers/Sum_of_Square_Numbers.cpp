class Solution {
public:
    bool judgeSquareSum(int c) {
        long long a = 0,b = sqrt(c)+1;
        while(a<=b) {
            long long sum = (a*a)+(b*b);
            if(sum == c) return true;
            else if(sum > c) {
                b--;
            }
            else {
                a++;
            }
        }
        return false;
    }
};