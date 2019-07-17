package Problems.P037_SudokuSolver;


/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/17 16:31;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        char[][] board=
                       {{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}};
//        for(int i = 0; i < board.length;i++){
//            for(int j = 0;  j< board[i].length;j++){
//                System.out.print(board[i][j]+"\t");
//            }
//            System.out.println();
//        }

        new Method1().solveSudoku(board);

    }
}