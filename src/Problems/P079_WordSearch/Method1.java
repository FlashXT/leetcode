package Problems.P079_WordSearch;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/6 16:10;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        int [][] visited = new int [m][n];
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n;j++){
                if(exist(board,visited,i,j,0,word))
                    return true;
            }
        }
        return false;

    }
    private boolean exist(char[][] board, int [][] visited,int row,int col,int index,String word) {

        if(index==word.length()){
             return true;
        }
        boolean a=false,b=false,c=false,d=false;
        if(row >=0 && row < board.length && col >=0 && col < board[0].length){
            if(word.charAt(index) == board[row][col] && visited[row][col] == 0) {
                visited[row][col]=1;
                a = exist(board,visited,row+1,col,index+1,word);
                if(!a)
                    b = exist(board,visited,row-1,col,index+1,word);
                if(!a&&!b)
                    c = exist(board,visited,row,col+1,index+1,word);
                if(!a&&!b&&!c)
                    d = exist(board,visited,row,col-1,index+1,word);
                visited[row][col]=0;
            }
        }

        return a||b||c||d;
    }
}
