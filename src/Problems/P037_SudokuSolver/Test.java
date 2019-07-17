package Problems.P037_SudokuSolver;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/17 19:15;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Test {
    public static void main(String [] args){
        print(10);
    }
    public static  void print(int n){
        if(n>0)

            print(n-1);
        System.out.println(n);
    }
}
