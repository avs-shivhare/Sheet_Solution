class Solution {

    void printTriangle(int n) {
        // in this pattern 
        // if row no. is even in zero based indexing then 
        // element start with 1
        // otherwise 0
        // and change alternative
        for(int i =0; i<n; i++) {
            boolean flag = false;
            if(i%2 == 0) flag = true;
            for(int j =0; j<=i; j++) {
                if(flag) System.out.print("1 ");
                else System.out.print("0 ");
                flag = !flag;
            }
            System.out.println();
        }
    }
}