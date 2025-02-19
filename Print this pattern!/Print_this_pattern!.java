class Solution{
    void printPattern(int n){
        for (int i = n; i > 0; i--) {
            StringBuilder temp = new StringBuilder();
            for (int j = n; j > 0; j--) {
                if (j >= i) temp.append(j);
                else temp.append(i);
            }
            String tt = temp.toString();
            String reversed = new StringBuilder(temp).reverse().toString();
            System.out.println(tt.substring(0, tt.length() - 1) + reversed);
        }
        
        for (int i = 2; i <= n; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = n; j > 0; j--) {
                if (j >= i) temp.append(j);
                else temp.append(i);
            }
            String tt = temp.toString();
            String reversed = new StringBuilder(temp).reverse().toString();
            System.out.println(tt.substring(0, tt.length() - 1) + reversed);
        }
    }
}