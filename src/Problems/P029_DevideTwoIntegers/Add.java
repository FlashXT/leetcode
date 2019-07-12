package Problems.P029_DevideTwoIntegers;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/12 15:20;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Add {
   //位运算做加法，做减法先求b的变补（~b+1）
    public static int add(int a,int b) {
        int res=a;
        int xor=a^b;//得到原位和
        int forward=(a&b)<<1;//得到进位和
        if(forward!=0){//若进位和不为0，则递归求原位和+进位和
            res=add(xor, forward);
        }else{
            res=xor;//若进位和为0，则此时原位和为所求和
        }
        return res;
    }

}
