class Solution {
    public ArrayList<Integer> printPat(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        // we need to print n lines in this pattern
        for(int i = n; i>=1; i--) {
            // for each line we need to print i to 1, i times
            for(int j = n; j>=1; j--) {
                // repeatedly adding j digit i times
                for(int x = 1; x<=i; x++) {
                    ans.add(j);
                }
            }
            ans.add(-1);
        }
        return ans;
    }
}