class Solution{
    ArrayList<String> numberPattern(int n){
        // we have to store number as a string 
        // try to find pattern 
        ArrayList<String> ans = new ArrayList<>();
        // first loop is running from i-> 1 to n
        for(int i =1; i<=n; i++) {
            // then 1 to i value are store in string 
            String temp= "";
            for(int j =1; j<=i; j++) {
                temp += Integer.toString(j);
            }
            // after that i-1 to 1 values are stored
            for(int j =i-1; j>0; j--) {
                temp += Integer.toString(j);
            }
            ans.add(temp);
        }
        return ans;
    }
}