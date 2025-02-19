class Solution {
    public void sumArray(List<Integer> arr) {
        // 1st solution
        
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, sum - arr.get(i));
        }
        
        
        // 2nd solution
        
        
        // int n = arr.size();
        // int prefix[] = new int[n];
        // int suffix[] = new int[n];
        // int sum = 0;

        // for (int i = 0; i < n; i++) {
        //     prefix[i] = sum;
        //     sum += arr.get(i);
        // }

        // sum = 0;
        // for (int i = n - 1; i >= 0; i--) {
        //     suffix[i] = sum;
        //     sum += arr.get(i);
        // }

        // for (int i = 0; i < n; i++) {
        //     arr.set(i, prefix[i] + suffix[i]);
        // }
    }
}