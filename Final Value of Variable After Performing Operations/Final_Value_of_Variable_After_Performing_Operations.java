class Solution {
    public int finalValueAfterOperations(String[] arr) {
        int x = 0;
        for(int i = 0; i<arr.length; i++) {
            String s = arr[i];
            if(s == "X++" || s == "++X" ) x++;
            else x--;
        }
        return x;
    }
}