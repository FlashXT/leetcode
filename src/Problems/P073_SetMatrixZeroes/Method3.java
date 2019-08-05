package Problems.P073_SetMatrixZeroes;

//https://leetcode.com/problems/set-matrix-zeroes/solution/
//思路：使用矩阵的第一行和第一列保存需要置为0的行和列：
//若matrix[i][j] = 0：则将matrix[i][0]置为0，matrix[0][j]置为0；
//但是matrix[0][0]会同时表示第0行和第0列，因此需要另外设置一个标志变量将第0行和第0列进行区分；
//最后需要将第0行和第0列单独处理；(不推荐该方法)
public class Method3 {
    public void setZeroes(int[][] matrix) {
        //isCol用来标记第0列
        boolean isCol = false;
        int R = matrix.length;
        int C = matrix[0].length;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < R; i++) {
            //判断每一行的第0列
            if (matrix[i][0] == 0)
                isCol = true;
            //从第一列开始判断
            for (int j = 1; j < C; j++) {
                // 若matrix[i][j] = 0：则将matrix[i][0]置为0，matrix[0][j]置为0；
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }

        }

        //将行列置0
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }
        //第一行单独处理
        if(matrix[0][0] == 0){
            for(int i = 0; i< C;i++)
                matrix[0][i] = 0;
        }
        //第一列单独处理
        if(isCol){
            for(int i = 0; i< R;i++)
                matrix[i][0] = 0;
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
