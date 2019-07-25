package Problems.P050_Power;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/25 11:11;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public double myPow(double x, int n) {
        if(x == 1.0f)
            return 1;
        else if(x == -1){
            if(n%2 == 0)
                return 1;
            else
                return -1;
        }
        if(n == -2147483648)
            return 0;

        if(n == 0)
            return 1;
        if(n > 0)
           return myPowR(x,n);
        else{
            return 1/myPowR(x,-n);
        }


    }

    public double myPowR(double x, int n) {
        if(n == 1)
            return x;
        //设置一个变量保存计算结果，减少递归次数
        double temp = myPowR(x,n/2);
        if(n % 2 == 0){
            return temp*temp;
        }
        else
            return x*temp*temp;
    }
}
