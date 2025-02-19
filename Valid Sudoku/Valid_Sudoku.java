class Solution {
    public boolean valid(char[][] nums, int row, int col) {
        for (int i = 0; i < 9; i++) {
            if (nums[row][col] == nums[row][i] && col != i) return false;
            if (nums[i][col] == nums[row][col] && row != i) return false;
            if (nums[row][col] == nums[(row / 3) * 3 + (i / 3)][(col / 3) * 3 + (i % 3)] &&
                row != (row / 3) * 3 + (i / 3) && col != (col / 3) * 3 + (i % 3)) return false;
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                if (!valid(board, i, j)) return false;
            }
        }
        return true;
    }
}