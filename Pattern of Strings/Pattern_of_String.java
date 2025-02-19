class Solution {
    ArrayList<String> pattern(String s) {
        // here we have to print character in each row
	    // start with full length and decrease by 1
	    int n = s.length();
	    ArrayList<String> ans = new ArrayList<>();
	    for(int i = n; i>0; i--) {
	        String temp = "";
	        for(int j =0; j<i; j++) {
	           temp += s.charAt(j);
	        }
	        ans.add(temp);
	    }
	    return ans;
    }
};