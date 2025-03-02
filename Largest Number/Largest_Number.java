class Solution {
    public String largestNumber(int[] nums) {
        List<String> numStrs = new ArrayList<>();
        for (int num : nums) {
            numStrs.add(Integer.toString(num));
        }
        
        Collections.sort(numStrs, new Comparator<String>() {
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;
                return ba.compareTo(ab);
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for (String s : numStrs) {
            sb.append(s);
        }
        String ans = sb.toString();
        
        if (ans.charAt(0) == '0') {
            return "0";
        }
        return ans;
    }
}