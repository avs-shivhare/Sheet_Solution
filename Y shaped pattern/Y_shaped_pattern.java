class Solution {
    static String[] yShapedPattern(int n) {
        int left = 1, right = n + 1;
        String[] ans = new String[n];
        
        for (int i = 1; i <= n; i++) {
            StringBuilder temp = new StringBuilder();
            
            for (int j = 1; j <= n + 1; j++) {
                if (j == left || j == right) {
                    temp.append("*");
                } else {
                    temp.append(" ");
                }
            }
            
            if (left < right) {
                left++;
                right--;
            }
            
            ans[i - 1] = temp.toString();
        }
        
        return ans;
    }
};