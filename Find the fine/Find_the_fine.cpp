class Solution {
  public:
    long long int totalFine(int date, vector<int> &car, vector<int> &fine) {
        long long ans =0;
        bool flag = true;
        if(date%2 == 1) flag = false;
        int n = car.size();
        for(int i =0;i<n; i++) {
            if(flag) {
                if(car[i]%2 == 1) ans += fine[i]; 
            }
            else if(car[i]%2 == 0) ans += fine[i];
        }
        return ans;
    }
};