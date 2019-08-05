package Problems.P073_SetMatrixZeroes;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Method1 {
    static class pos{
        int row;
        int col;
        public pos(int i ,int j){
            this.row = i;
            this.col = j;
        }
    }
    public void setZeroes(int[][] matrix) {
        Set<pos> set = new HashSet<>();
        for(int i = 0 ; i<matrix.length;i++){
            for(int j = 0; j < matrix[i].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

        for(int i = 0 ; i<matrix.length;i++){
            for(int j = 0; j < matrix[i].length;j++){
                if(matrix[i][j] ==0)
                   set.add(new pos(i,j));
            }
        }

        Iterator<pos> iter= set.iterator();
        while(iter.hasNext()){
            pos temp = iter.next();
              rcZeros(matrix,temp.row,temp.col);
        }
        for(int i = 0 ; i<matrix.length;i++){
            for(int j = 0; j < matrix[i].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    private static void rcZeros(int [][] matrix,int row ,int col){
        //行置0
        for(int i = 0; i < matrix[row].length;i++){
                matrix[row][i] = 0;
        }
        //列置0
        for(int j = 0; j <matrix.length ;j++){
                matrix[j][col] = 0;
        }
    }

}
