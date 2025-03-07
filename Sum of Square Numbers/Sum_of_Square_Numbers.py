class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        a, b = 0, int(c**0.5) + 1
        while a <= b:
            sum_ = a * a + b * b
            if sum_ == c:
                return True
            elif sum_ > c:
                b -= 1
            else:
                a += 1
        return False
        