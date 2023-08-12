package DSA;

class Solution {
    private boolean isCorrectToPlaceNumber(int row,int col,char value,char[][]board)
    {
        return false;
    }
    char[][] board;
    private boolean solve(int row,int col)
    {
        if(board.length == col)
        {
             solve(row+1,0);
        }
        if(board.length == row)
        {
            return true;
        }
        if(board[row][col] != '.')
        {
            return solve(row,col+1);
        }
        return false;
    }

    public void solveSudoku(char[][] board) {


    }
}
public class SudokuSolverProblem {

}
