package Problems.P051_N_Queens;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/25 15:44;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {

        int [] row = new int[n];
        NQueens(row,0);
//        System.out.println(res.size());
        return res;

    }
    private void NQueens(int[] row ,int index){
        if(index == row.length){
            List<String> temp = new ArrayList<>();

            for(int i = 0 ; i < row.length;i++ ){
                StringBuilder str = new StringBuilder();
                for(int j = 0; j < row.length;j++){
                    if(j != row[i])
                        str.append('.');
                    else
                        str.append('Q');
                }
                temp.add(str.toString());
            }
            res.add(temp);
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
