class Solution {
  public:
    void fibonacii(unordered_set<long long> &st,long long &maxi) {
        long long first = 0,second = 1;
        st.insert(first);
        st.insert(second);
        while(first +second <= maxi) {
            long long temp = first+second;
            st.insert(temp);
            first = second;
            second = temp;
        }
        return;
    }
    int countFibonacciNumbers(vector<long long>& arr) {
        long long maxi = *max_element(arr.begin(),arr.end());
        unordered_set<long long> st;
        fibonacii(st,maxi);
        int cnt =0;
        for(auto i: arr) {
            if(st.count(i)) cnt++;
        }
        return cnt;
    }
};
