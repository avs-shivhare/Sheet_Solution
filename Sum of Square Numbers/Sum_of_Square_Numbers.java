class Solution {
    public boolean judgeSquareSum(int c) {
        long a = 0,b = (long)Math.sqrt(c)+1;
        while(a<=b) {
            long sum = (a*a)+(b*b);
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
}