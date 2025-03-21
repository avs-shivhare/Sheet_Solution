class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        n, m = len(matrix), len(matrix[0])
        row = [0] * n
        col = [0] * m
        
        for i in range(n):
            for j in range(m):
                if matrix[i][j] == 0:
                    row[i] += 1
                    col[j] += 1
        
        for i in range(n):
            for j in range(m):
                if row[i] > 0 or col[j] > 0:
                    matrix[i][j] = 0
        