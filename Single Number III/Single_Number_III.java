class Solution {
    public int[] singleNumber(int[] nums) {
        int XOR = 0;
        for (int num : nums) {
            XOR ^= num;
        }
        
        int x = 0;
        for (x = 0; x < 32; x++) {
            if ((XOR & (1 << x)) != 0) {
                break;
            }
        }
        
        int first = 0, second = 0;
        for (int num : nums) {
            if ((num & (1 << x)) != 0) {
                first ^= num;
            } else {
                second ^= num;
            }
        }
        
        return new int[] {first, second};
    }
}