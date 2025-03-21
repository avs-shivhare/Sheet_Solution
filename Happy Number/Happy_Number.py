class Solution:
    def isHappy(self, n: int) -> bool:
        st = set()
        while n != 1:
            if n in st:
                return False
            st.add(n)
            n = sum(int(digit) ** 2 for digit in str(n))
        return True