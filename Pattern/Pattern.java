class Solution {

    void printDiamond(int n) {
        for(int i =1; i<=n; i++) {
            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int i =n; i>0; i--) {
            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}