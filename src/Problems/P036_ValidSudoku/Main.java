package Problems.P036_ValidSudoku;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/17 14:28;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        char[][] board=
             {{'.','.','.','.','5','.','.','1','.'},
             {'.','4','.','3','.','.','.','.','.'},
             {'.','.','.','.','.','3','.','.','1'},
             {'8','.','.','.','.','.','.','2','.'},
             {'.','.','2','.','7','.','.','.','.'},
             {'.','1','5','.','.','.','.','.','.'},
             {'.','.','.','.','.','2','.','.','.'},
             {'.','2','.','9','.','.','.','.','.'},
             {'.','.','4','.','.','.','.','.','.'}};
        for(int i = 0; i < board.length;i++){
            for(int j = 0;  j< board[i].length;j++){
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println(new Method1().isValidSudoku(board));

    }
}
