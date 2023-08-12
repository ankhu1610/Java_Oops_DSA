package DSA;

import java.util.ArrayList;
import java.util.*;
public class nQueenPart2 {
    boolean isQueenPlaceOnSafeArea(boolean [][]board, int row, int col){
        // Check - 1 Checking on Above Row
        for(int i = row; i>=0; i--){
            if(board[i][col]){ // There is a Queen
                return false;
            }
        }
        // check -2 Left Diagonal Check
        for(int i = row, j = col; i>=0&& j>=0 ; i--, j--){
            if(board[i][j]){
                return false;
            }
        }
        // Check -3 Right Diagonal Check
        for(int i = row, j=col; i>=0 && j<board[row].length; i--, j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }
        List<List<String>> al = new ArrayList<>();
    List<List<String>> solveProblem(boolean board[][],int index)
    {

        if(index == board.length )
        {
            System.out.println(" 1 ");
            List<String> arrayList = new ArrayList<>();
            for(int i = 0;i< board.length;i++)
            {

                String str = "";
                for(int j = 0;j<board[i].length;j++)
                {
                    if(board[i][j] == true)
                    {
                        str += 'Q';
                    }
                    else
                    {
                        str += '.';
                    }
                }
                arrayList.add(str);

            }
            al.add(arrayList);
            return al;
        }
        for(int i = 0;i< board[index].length;i++)
        {
            if(isQueenPlaceOnSafeArea(board,index,i))
            {
                board[index][i] = true;
                al = solveProblem(board,index+1);
                board[index][i] = false;
            }
        }
        return al;
    }
    List<List<String>> solveNQueens(int n)
    {
        boolean Board[][] = new boolean[n][n];
        solveProblem(Board,0);



        return al;
    }
    public static void main(String[] args) {
        nQueenPart2 obj = new nQueenPart2();

        System.out.println(obj.solveNQueens(9));
    }
}
