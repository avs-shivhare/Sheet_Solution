class Solution {

    void printTriangle(int n) {
        // same approach as previous question but the difference is that 
        // instate of printing row no. we have to print no. from increasing
        // order in every element from 1 to n
        int no =1;
        for(int row =1; row<=n; row++) {
            for(int col =1; col<=row; col++) {
                System.out.print(no++ + " ");
            }
            System.out.println();
        }
    }
}