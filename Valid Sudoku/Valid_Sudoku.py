class Solution:
    def valid(self, board, row, col):
        for i in range(9):
            if board[row][col] == board[row][i] and col != i:
                return False
            if board[i][col] == board[row][col] and row != i:
                return False
            if (board[row][col] == board[(row // 3) * 3 + (i // 3)][(col // 3) * 3 + (i % 3)] 
                and row != (row // 3) * 3 + (i // 3) 
                and col != (col // 3) * 3 + (i % 3)):
                return False
        return True
        
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for i in range(9):
            for j in range(9):
                if board[i][j] == '.':
                    continue
                if not self.valid(board, i, j):
                    return False
        return True
        