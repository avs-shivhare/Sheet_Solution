class Solution:
    def fibonacci(self, st, maxi):
        first, second = 0, 1
        st.add(first)
        st.add(second)
        while first + second <= maxi:
            temp = first + second
            st.add(temp)
            first, second = second, temp
            
            
    def countFibonacciNumbers(self, arr):
        maxi = max(arr)
        st = set()
        self.fibonacci(st, maxi)
        cnt = 0
        for i in arr:
            if i in st:
                cnt += 1
        return cnt
