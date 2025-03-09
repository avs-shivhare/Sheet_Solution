class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int unplace = 0;
        for(int i =0; i<n; i++) {
            boolean flag = false;
            for(int j = 0; j<n; j++) {
                if(baskets[j] >= fruits[i]) {
                    baskets[j] = 0;
                    flag = true;
                    break;
                }
            }
            if(flag == false) unplace++;
        }
        return unplace;
    }
}