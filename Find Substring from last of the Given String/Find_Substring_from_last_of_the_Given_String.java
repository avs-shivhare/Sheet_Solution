class Solution {
    int search(String X, String Y) {
        int ind = X.lastIndexOf(Y);
        if(ind == -1) return -1;
        return ind+1;
    }
}