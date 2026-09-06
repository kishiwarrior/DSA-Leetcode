class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][10];
        boolean[][] cols = new boolean[9][10];
        boolean[][] squares = new boolean[9][10];

        for (int i = 0 ; i < 9; i++) {
            for ( int j = 0 ; j < 9; j++) {
                if (board[i][j]=='.') 
                    continue;
                int n = board[i][j] - '0';
                if (rows[i][n]) {
                    return false;
                }
                if (cols[j][n]) {
                    return false;
                }
                if (squares[(i/3)*3+(j/3)][n])
                    return false;
                rows[i][n] = true;
                cols[j][n] = true;
                squares[(i/3)*3+(j/3)][n] = true;
            }
        }
        return true;

    }
}