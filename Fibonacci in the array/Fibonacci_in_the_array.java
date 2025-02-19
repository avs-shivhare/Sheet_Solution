class Solution {
    public void fibonacci(Set<Long> fibSet, long maxVal) {
        long first = 0, second = 1;
        fibSet.add(first);
        fibSet.add(second);
        while (first + second <= maxVal) {
            long temp = first + second;
            fibSet.add(temp);
            first = second;
            second = temp;
        }
    }
    public int countFibonacciNumbers(long[] arr) {
        long maxVal = Arrays.stream(arr).max().getAsLong();
        Set<Long> fibSet = new HashSet<>();
        fibonacci(fibSet, maxVal);
        int count = 0;
        for (long num : arr) {
            if (fibSet.contains(num)) {
                count++;
            }
        }
        return count;
    }
}