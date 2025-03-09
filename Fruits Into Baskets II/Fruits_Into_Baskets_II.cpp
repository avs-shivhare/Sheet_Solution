class Solution {
public:
    int numOfUnplacedFruits(vector<int>& fruits, vector<int>& baskets) {
        int n = fruits.size();
        int unplace = 0;
        for(int i =0; i<n; i++) {
            bool flag = false;
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
};