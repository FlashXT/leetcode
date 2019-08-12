package Problems.P085_MaximalRectangle;

//暴力方法O(m*m*n)
public class Method1 {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0) return 0;
        //保存当前位置结尾的连续1的个数
        int [][]width = new int[matrix.length][matrix[0].length];
        int maxArea = 0;
        for(int i = 0;  i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length;j++){
               if(matrix[i][j] =='1'){
                   if(j == 0){
                       width[i][j]=1;
                   }
                   else{
                       width[i][j] = width[i][j-1]+1;
                   }
               }else{
                   width[i][j] = 0;
               }
               int minwidth = width[i][j];
               for(int row = i; row >=0;row--){
                   int h = i - row +1;
                   minwidth = Math.min(minwidth,width[row][j]);
                   maxArea = Math.max(maxArea,h*minwidth);
               }
            }
        }
        return maxArea;
    }

}
