package Problems.P073_SetMatrixZeroes;

public class Method2 {
    public void setZeroes(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0; j< matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for(int i = 0 ; i < rows.length;i++){
            if(rows[i]){
                setRowZeros(matrix,i);
            }
        }
        for(int i = 0 ; i < cols.length;i++){
            if(cols[i]){
                setColZeros(matrix,i);
            }
        }

    }
    //
    private void setRowZeros(int[][] matrix,int row){
        //行置0
        for(int i = 0; i < matrix[row].length;i++){
            matrix[row][i] = 0;
        }

    }
    private void setColZeros(int[][] matrix,int col){
        //列置0
        for(int j = 0; j <matrix.length ;j++){
            matrix[j][col] = 0;
        }
    }

}
