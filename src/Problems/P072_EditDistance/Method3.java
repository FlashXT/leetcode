package Problems.P072_EditDistance;

public class Method3 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int [][]memo = new int [m+1][n+1];
        for(int i = 0; i < memo[0].length;i++)
            memo[0][i] = i;
        for(int i = 0; i < memo.length;i++)
            memo[i][0] = i;
        int dis = 0;
        for(int i =1; i< memo.length;i++){
            char w1c = word1.charAt(i-1);
            for(int j = 1; j< memo[i].length;j++){
                dis = 0;
                if( w1c!= word2.charAt(j-1))
                    dis=1;
                memo[i][j] = Math.min(Math.min(memo[i-1][j]+1,memo[i][j-1]+1),memo[i-1][j-1]+dis);
            }
        }
        for(int i =0; i< memo.length;i++){
            for(int j = 0; j< memo[i].length;j++) {
            System.out.print(memo[i][j]+"\t");
            }
            System.out.println();
        }
        return memo[m][n];
    }
}
