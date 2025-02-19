class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        n = len(matrix)
        m = len(matrix[0])
        temp = [[0] * m for _ in range(n)]
        for i in range(n):
            for j in range(m):
                temp[j][n - i - 1] = matrix[i][j]
        for i in range(n):
            for j in range(m):
                matrix[i][j] = temp[i][j]
        """
        Do not return anything, modify matrix in-place instead.
        """
        