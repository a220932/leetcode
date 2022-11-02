class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] a = new int[9];
        for (int i = 0; i < 9; i++){
            Arrays.fill(a, 0);
            for (int j = 0; j < 9; j++){
                if ((board[i][j] != '.') && (a[board[i][j] - '1']++ != 0))
                    return false;
            }
        }
        for (int i = 0; i < 9; i++){
            Arrays.fill(a, 0);
            for (int j = 0; j < 9; j++){
                if ((board[j][i] != '.') && (a[board[j][i] - '1']++ != 0))
                    return false;
            }
        }
        for (int x = 0; x < 9; x+=3){
            for (int y = 0; y < 9; y+=3){
                Arrays.fill(a, 0);
                for (int i = 0; i < 3; i++){
                    for (int j = 0; j < 3; j++){
                        if ((board[x + i][y + j] != '.') && (a[board[x + i][y + j] - '1']++ != 0))
                            return false;
                    }
                }
            }
        }
        return true;
    }
}
