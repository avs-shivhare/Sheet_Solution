class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.size();
        for(int i =1; i<=n; i++) {
            if(arr.get(i-1) == i) ans.add(arr.get(i-1));
        }
        return ans;
    }
}