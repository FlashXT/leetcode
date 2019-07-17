package Problems.P036_ValidSudoku;

import java.util.HashSet;
import java.util.Set;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/17 16:04;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//解题思路很新颖：我们就可以把第一行的放在一起，第二行的放在一起……第一列的放在一起，
//第二列的放在一起……第一个小棋盘的放在一起，第二个小棋盘的放在一起……
//我们用 HashSet 实现放在一起的作用，但是这样的话总共就是 9 行，9 列，9 个小棋盘，
//27 个 HashSet 了。我们其实可以在放的时候标志一下，例如：
//  如果第 4 行有一个数字 8，我们就 4(8)，把 "4(8)"放进去。
//  如果第 5 行有一个数字 6，我们就 5(6)，把 "5(6)"放进去。
//  小棋盘看成一个整体，总共是 9 个，3 行 3 列，如果第 2 行第 1 列的小棋盘里有个数字 3，
//我们就把 "2(3)1" 放进去,这样 1 个 HashSet 就够了。
public class Method2 {
    public boolean isValidSudoku(char[][] board){
        Set<String> set = new HashSet<>();
        for(int i = 0; i < board.length;i++){
            for(int j = 0; j < board[i].length;j++){
                char number = board[i][j];
                if(number !='.'){
                    if(!set.add(number+"_row+"+i)||
                            !set.add(number+"_col_"+j)||
                              !set.add(number+"_block_"+"("+i/3+","+j/3+")"))
                        return false;

                }
            }
        }
        return true;
    }
}
