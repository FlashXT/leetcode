package Problems.P059_SpiralMatrixII;

public class Method1 {

    public int[][] generateMatrix(int n) {
      int [][] res = new int[n][n];
      int target = 1;
      int rowL = 0,rowR = n-1;
      int colL = 0,colR = n-1;
      while(rowL <= rowR && colL <= rowR){
            target = bulidmatrix(res,target,rowL,rowR,colL,colR);
            rowL++;
            rowR--;
            colL++;
            colR--;

      }
      for(int i = 0; i< res.length;i++){
          for(int j = 0; j < res[i].length;j++){
              System.out.print(res[i][j]+"\t");
          }
          System.out.println();
      }
      return res;
    }
    private int bulidmatrix(int [][] res,int target,int rowL,int rowR,int colL,int colR){
        //从左到右处理一行
        for(int i = colL; i < colR;i ++){
            res[rowL][i] = target++;
        }
        //从上到下处理一列
        for(int i = rowL; i <= rowR;i ++){
            res[i][colR] = target++;
        }
        //从右到左处理一行
        if(rowL < rowR){
            for(int i = colR-1; i > colL;i --){
                res[rowR][i] = target++;
            }
        }

        //从下到上处理一列
        if(colL < colR){
            for(int i = rowR; i > rowL;i --){
                res[i][colL] = target++;
            }
        }
        return target;
    }

}
