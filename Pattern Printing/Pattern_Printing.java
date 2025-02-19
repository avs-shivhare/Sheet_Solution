class Solution{
    static void printPattern(int n){
        // outer loop for printing n asterisk(*)
        for(int i =1; i<=n; i++) {
            //inner loop which print i asterisk(*) 
            for(int j =1; j<=i; j++) {
                System.out.print("*");
            }
            // space
            System.out.print(" ");
        }
    }
}