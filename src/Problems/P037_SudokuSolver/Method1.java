package Problems.P037_SudokuSolver;

import java.util.HashSet;
import java.util.Set;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/17 16:31;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public void solveSudoku(char[][] board) {
       solveSudokuk(board);
       Print(board);

    }
    public boolean solveSudokuk(char[][] board){
        char [] nums={'0','1','2','3','4','5','6','7','8','9'};

        for(int i = 0; i< board.length;i++){
            for(int j = 0; j<board[i].length;j++){

                if(board[i][j]=='.'){

                    for(int k = 1;k<=9;k++){
                        board[i][j]=nums[k];
                        if(isValidSudoku(board,i,j)&&solveSudokuk(board)){
                            return true;

                        }
                        board[i][j]='.';
                    }
                    return false;
                }

            }
        }
        return true;
    }

    public void Print(char [][] board){
        System.out.println("-------------------------------------");
        for(int i = 0; i < board.length;i++){
            for(int j = 0;  j< board[i].length;j++){
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public boolean isValidSudoku(char[][] board,int row,int col){
        Set<Character> set = new HashSet<>();
        //判断所在行
        for(int j = 0; j < board[row].length;j++){
            char number = board[row][j];
            if(number !='.'){
                if(!set.add(board[row][j]))

                    return false;
            }
        }
        set.clear();
        //判断所在列
        for(int i = 0; i < board[row].length;i++){
            char number = board[i][col];
            if(number !='.'){
                if(!set.add(board[i][col]))
                    return false;
            }
        }
        set.clear();
        //判断所在block
        int br = row/3,cl = col/3;
        for(int i =br*3 ;i<br*3+3;i++){
            for(int j = cl*3;j < cl*3+3;j++){
                char number = board[i][j];
                if(number !='.'){
                    if(!set.add(board[i][j]))
                        return false;
                }
            }
        }
        return true;
    }
}
