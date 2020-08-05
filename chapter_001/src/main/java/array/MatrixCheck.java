package array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            char rsl = board[i][i];
            int row = 0;
            int cell = 0;
            if (rsl == 'X') {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 'X') {
                        row++;
                    }
                    if (board[j][i] == 'X') {
                        cell++;
                    }
                    if (row == board.length || cell == board.length) {
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
