package Problems.P054_SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/25 16:15;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//对问题进行分解，将原问题分解为一圈打印4条边的子问题
public class Method2 {
    private List<Integer> res = new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0) return res;
        int rowS = 0,colL = 0,rowE = matrix.length-1,colR = matrix[0].length-1;
        while(rowS <= rowE && colL <= colR){
            printCircle(matrix,rowS,colL,rowE,colR);
            rowS++;
            rowE--;
            colL++;
            colR--;
        }
        return res;

    }
    public  void printCircle(int [][] matrix,int rowS, int colL,int rowE,int colR){
        //打印到内层时①总会执行

        //①从左到右打印一行
        for(int i = colL;  i < colR;i ++){
            res.add(matrix[rowS][i]);
//                System.out.print(matrix[rowS][i]+"\t");
        }


        //②从上到下打印一列
        for(int i = rowS;  i <= rowE;i ++){
            res.add(matrix[i][colR]);
//                System.out.print(matrix[i][colR]+"\t");
        }

        //③从右到左打印一行
        if(rowS < rowE){
            for(int i = colR-1;  i > colL;i --){
                res.add(matrix[rowE][i]);
//                System.out.print(matrix[rowE][i]+"\t");
            }
        }

        //④从下到上打印一列
        if(colL < colR){
            for(int i = rowE;  i  > rowS;i --){
                res.add(matrix[i][colL]);
//                System.out.print(matrix[i][colL]+"\t");
            }
        }

    }

}
