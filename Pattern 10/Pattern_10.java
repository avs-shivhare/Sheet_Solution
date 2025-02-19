class Solution {

    void printTriangle(int n) {
        // try to solve this problem by yourself 
        
        // in starting pattern is increase 
        // mean in every cell pattern is increasing
        // till nth row
        // after that it start decreasing
        
        // for increasing pattern
        for(int i =1; i<=n; i++) {
            for(int j =1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // for decreasing pattern
        for(int i = n-1; i>0; i--) {
            for(int j =1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}