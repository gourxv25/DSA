class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }


    private boolean solve(char[][] board){

        for(int i = 0;i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == '.'){
                    for(char c = '1'; c <= '9';c++){
                        
                        if(isValid(board, i, j, c)){
                            board[i][j] = c;
                            if(solve(board))
                                return true;

                              // backtrack
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }


    private boolean isValid(char[][] board, int row , int col, char num){
             for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) return false;
            if (board[i][col] == num) return false;
        }

        // check 3x3 box
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num)
                    return false;
            }
        }

        return true;

    }
}