class Solution {

    void printTriangle(int n) {
        // similar approach as seen in previous question
        // difference is that we replace character with no.
        
        for(int row = 1; row<=n; row++) {
            char no = 'A';
            for(int col =1; col<=row; col++) {
                System.out.print(no++);
            }
            System.out.println();
        }
    }
}