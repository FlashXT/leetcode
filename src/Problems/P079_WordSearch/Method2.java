package Problems.P079_WordSearch;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/6 17:37;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method2 {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        int [][] visited = new int [m][n];
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n;j++){
                if(existPath(board,visited,i,j,0,word))
                    return true;
            }
        }
        return false;

    }
    public boolean existPath(char [][] board,int [][] visited,int row ,int col,int index,String word){
        if(index >= word.length()) return true;
        boolean hasPath = false;
        if(row >= 0 && row < board.length && col >=0 && col < board[0].length &&
                board[row][col] == word.charAt(index)&&visited[row][col]==0){
            visited[row][col] = 1;
            hasPath = existPath(board,visited,row,col-1,index+1,word)||
                    existPath(board,visited,row,col+1,index+1,word)||
                    existPath(board,visited,row-1,col,index+1,word)||
                    existPath(board,visited,row+1,col,index+1,word);
            visited[row][col] = 0;
        }
        return hasPath;

    }
}
