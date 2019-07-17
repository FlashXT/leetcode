package Problems.P037_SudokuSolver;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/17 19:24;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class EightQueen {
    static int count = 0;
    public static  void main(String [] args){
        int [] res = new int[8];
        eightQueen(res,0);
        System.out.println(count);
    }
    public static void eightQueen(int [] res,int row){
        if(row == res.length){
            for(int i = 0; i<res.length;i++){
                for(int j = 0; j<res.length;j++){
                    if(j != res[i])
                        System.out.print("o\t");
                    else
                        System.out.print("*\t");
                }
                System.out.println();
            }
            System.out.println("==============================");
            count++;
            return;
        }
        for(int i = 0; i < res.length;i++){
            res[row]=i;
            if(isValid(res,row))
                eightQueen(res,row+1);
        }
    }
    public static boolean isValid(int [] res,int row){{
        for(int i = 0; i <row;i++){
            if(Math.abs(res[row]-res[i]) == row-i||res[row]==res[i])
                return false;
        }
        return true;
    }

    }
}
