package Problems.P050_Power;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/25 11:11;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//在n<0时，求需要求-n,当n = - 2^31时，求-n = 2^31,超出int范围，溢出后
// 仍为-2^31,因此考虑当 n < 0时，将x变为1/x;
public class Method3 {
    public double myPow(double x, int n) {

        if(n == 0)
            return 1;
        if(n > 0)
           return myPowR(x,n);
        else{
            //改进将x 变为1/x,不处理n
            return myPowR(1/x,n);
        }


    }

    public double myPowR(double x, int n) {
        //对于方法一的改进
        if(n == 0)
            return 1;
        //设置一个变量保存计算结果，减少递归次数
        double temp = myPowR(x,n/2);
        if(n % 2 == 0){
            return temp*temp;
        }
        else
            return x*temp*temp;
    }
}
