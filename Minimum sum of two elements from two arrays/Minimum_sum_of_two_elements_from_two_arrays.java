class Solution {
    public int[] minimum(int[] arr) {
        int mini = (int) 1e9, secondMini = (int) 1e9;
        int minIndex = -1, secondMiniIndex = -1;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (mini > arr[i]) {
                secondMini = mini;
                secondMiniIndex = minIndex;
                mini = arr[i];
                minIndex = i;
            } else if (secondMini > arr[i]) {
                secondMini = arr[i];
                secondMiniIndex = i;
            }
        }
        return new int[] { mini, secondMini, minIndex, secondMiniIndex };
    }
    public int minSum(int[] arr1, int[] arr2) {
        int[] x = minimum(arr1);
        int[] y = minimum(arr2);
        int ans = (int) 1e9;

        if (x[2] != y[2]) {
            return x[0] + y[0];
        } else if (arr1.length == 1 || arr2.length == 1) {
            return Math.min(x[0], y[0]);
        }

        if (x[3] != -1) {
            ans = Math.min(ans, y[0] + x[1]);
        }
        if (y[3] != -1) {
            ans = Math.min(ans, x[0] + y[1]);
        }

        if (ans == (int) 1e9) {
            return Integer.MIN_VALUE;
        }
        return ans;
    }
}
