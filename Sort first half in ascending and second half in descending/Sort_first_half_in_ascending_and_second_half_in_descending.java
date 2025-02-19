class Solution {
    public ArrayList<Integer> customSort(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        
        Collections.sort(list.subList(0, n / 2));
        Collections.sort(list.subList(n / 2, n), Collections.reverseOrder());
        
        return list;
    }
}