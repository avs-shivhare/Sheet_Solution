class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        XOR = 0
        for num in nums:
            XOR ^= num
            
        x = 0
        for x in range(32):
            if XOR & (1 << x):
                break
                
        first, second = 0, 0
        for num in nums:
            if num & (1 << x):
                first ^= num
            else:
                second ^= num
                
        return [first, second]
        