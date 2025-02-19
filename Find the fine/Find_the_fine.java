class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        long ans = 0;
        boolean isEvenDate = (date % 2 == 0);
        int n = car.length;

        for (int i = 0; i < n; i++) {
            if (isEvenDate && car[i] % 2 == 1) {
                ans += fine[i];
            } else if (!isEvenDate && car[i] % 2 == 0) {
                ans += fine[i];
            }
        }
        return ans;
    }
}