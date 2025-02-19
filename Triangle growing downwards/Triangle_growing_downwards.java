class Solution{
    static void printTriangleDownwards(String str){
        int n = str.length();
        for(int i =0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                System.out.print(".");
            }
            for(int j = 0; j<=i; j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}