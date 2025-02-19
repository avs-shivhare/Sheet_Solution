class Solution {
    static String[] interestingPattern(int n) {
        String[] ans = new String[2 * n - 1];
        int index = 0;
        
        for (int i = n; i > 0; i--) {
            StringBuilder temp = new StringBuilder();
            for (int j = n; j > 0; j--) {
                if (j >= i) temp.append(j);
                else temp.append(i);
            }
            String tt = temp.toString();
            temp.reverse();
            String result = tt.substring(0, tt.length() - 1) + temp.toString();
            ans[index++] = result;
        }
        
        for (int i = 2; i <= n; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = n; j > 0; j--) {
                if (j >= i) temp.append(j);
                else temp.append(i);
            }
            String tt = temp.toString();
            temp.reverse();
            String result = tt.substring(0, tt.length() - 1) + temp.toString();
            ans[index++] = result;
        }
        
        return ans;
    }
};