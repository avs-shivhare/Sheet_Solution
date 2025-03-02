class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n = operations.length;
        int x = 0;
        for(int i = 0; i<n; i++) {
            String s = operations[i];
            if(s.equals("X++") || s.equals("++X")) x++;
            else x--;
        }
        return x;
    }
}