class Solution {

    void printTriangle(int n) {
        // just reverse version of previous question
        // iterate on outer loop on backward
        for(int row = n; row > 0; row--) {
            char no = 'A';
            for(int col =1; col<=row; col++) {
                System.out.print(no++);
            }
            System.out.println();
        }
    }
}