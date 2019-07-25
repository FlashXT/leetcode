package Problems.P048_RotateImage;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/25 9:26;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//沿主对角线为轴交换，然后列交换
public class Method1 {
    public void rotate(int[][] matrix) {

        //以对角线为轴交换
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //交换列
        for(int i = 0; i < matrix[0].length/2;i++){
            for(int j = 0; j < matrix.length;j++){
                int temp = matrix[j][i];
                matrix[j][i]=matrix[j][matrix[0].length-1-i];
                matrix[j][matrix[0].length-1-i] = temp;
            }
        }

    }



}
