class Solution {
    static String[] revCharBridge(int n) {
        String[] ans = new String[n];
        
        for (int i = n; i > 0; i--) {
            StringBuilder temp = new StringBuilder();
            char ch = 'A';
            
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    temp.append(ch++);
                } else {
                    temp.append(" ");
                }
            }
            
            String t = temp.toString();
            String reversed = new StringBuilder(temp).reverse().toString();
            ans[n - i] = t + reversed.substring(1);
        }
        
        return ans;
    }
};