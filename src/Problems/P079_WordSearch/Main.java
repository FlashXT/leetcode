package Problems.P079_WordSearch;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/6 16:09;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        char [][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        boolean res = new Method1().exist(board,"ABCB");
        System.out.println(res);
    }

}
