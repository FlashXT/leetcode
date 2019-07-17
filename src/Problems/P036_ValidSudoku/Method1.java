package Problems.P036_ValidSudoku;

import java.util.HashMap;
import java.util.HashSet;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/17 14:28;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public boolean isValidSudoku(char[][] board) {
        //判断行
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < board.length;i++){
            set.clear();
            for(int j = 0; j < board[i].length;j++){
                if (board[i][j]!='.'){
                    if(!set.contains(board[i][j]-'0'))
                        set.add(board[i][j]-'0');
                    else
                        return false;
                }
            }
        }
        //判断列
        for(int i = 0; i < board.length;i++){
            set.clear();
            for(int j = 0; j < board[i].length;j++){
                if (board[j][i]!='.'){
                    int temp = board[j][i]-'0';
                    if(!set.contains(board[j][i]-'0'))
                        set.add(board[j][i]-'0');
                    else
                        return false;
                }

            }
        }
        //判断3*3子棋盘

        for(int i = 0; i< board.length;i+=3){
            for(int j = 0; j< board[i].length;j+=3) {
                set.clear();
                for (int m = i; m < i+3; m++) {
                    for (int n = j; n < j+3; n++) {

                        if (board[m][n] != '.') {
                            if (!set.contains(board[m][n] - '0'))
                                set.add(board[m][n] - '0');
                            else
                                return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
