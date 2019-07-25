package Problems.P052_N_Queens2;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/25 15:44;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    private int count = 0;
    public int totalNQueens(int n) {

        int [] row = new int[n];
        NQueens(row,0);
        System.out.println(count);
        return count;

    }
    private void NQueens(int[] row ,int index){
        if(index == row.length){
            count++;
            return ;
        }
        for(int i = 0; i < row.length;i++){
            if(isOk(row,index,i)){
                row[index] = i;
                NQueens(row,index+1);
            }
        }
    }
    private boolean isOk(int [] row,int index,int pos){
        for(int i = 0; i < index;i++){
            if(Math.abs(row[i]-pos)==index-i || pos==row[i])
                return false;
        }
        return true;
    }

}
