class Solution {
    public boolean isHappy(int n) {
        Set<Integer> st = new HashSet<>();
        while (n != 1) {
            if (st.contains(n)) {
                return false;
            }
            st.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return true;
    }
}