class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String arr[] = s.split("\\s+");
        int left = 0,right = arr.length-1;
        while(left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<arr.length; i++) {
            sb.append(arr[i]);
            if(i != arr.length-1) sb.append(" ");
        }
        return sb.toString();
    }
}