class Solution {

    void printTriangle(int n) {
        for(int i =n-1; i>=0; i--) {
	        for(int j =n-1; j>i; j--) {
	            System.out.print(" ");
	        }
	        for(int j =2*i+1; j>0; j--) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
    }
}