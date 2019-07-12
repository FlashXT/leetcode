package Problems.P029_DevideTwoIntegers;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/12 15:20;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
/*
Given two integers dividend and divisor, divide two integers without
using multiplication, division and mod operator.

Return the quotient after dividing dividend by divisor.

The integer division should truncate toward zero.
 */
//目前不熟练
public class Main {
    public static void main(String [] args){
        int a = 7,b = -3;
        int div = new Method1().divide(a,b);
        System.out.println(div);
    }

}
