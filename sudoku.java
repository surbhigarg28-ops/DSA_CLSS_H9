public class sudoku {

    static boolean isSafe(int[][] board, int row, int col, int num) {

        // Check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check 3x3 box
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    static boolean solveSudoku(int[][] board, int row, int col) {

        // Sudoku complete
        if (row == 9) {
            return true;
        }

        // Move to next row
        if (col == 9) {
            return solveSudoku(board, row + 1, 0);
        }

        // Already filled cell
        if (board[row][col] != 0) {
            return solveSudoku(board, row, col + 1);
        }

        // Try numbers 1 to 9
        for (int num = 1; num <= 9; num++) {

            if (isSafe(board, row, col, num)) {

                board[row][col] = num;

                if (solveSudoku(board, row, col + 1)) {
                    return true;
                }

                // Backtracking
                board[row][col] = 0;
            }
        }

        return false;
    }

    static void printBoard(int[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveSudoku(board, 0, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }
}