class Solution {
    int convertfive(int num) {
        String temp = Integer.toString(num);
        StringBuilder result = new StringBuilder(temp);
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '0') {
                result.setCharAt(i, '5');
            }
        }
        return Integer.parseInt(result.toString());
    }
}