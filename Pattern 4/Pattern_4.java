class Solution {

    void printTriangle(int n) {
        // first look given example and try to yourself
        // total no. of element in each row is equal to row no.
        // each element in a row is the row no.
        for(int row =1; row<=n; row++) {
            for(int col =1; col<=row; col++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}