package Problems.P011_ContainerWithMostWater;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/6/27 9:33;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static  void main(String [] args){
        int[] height ={2,3,10,5,7,8,9};
        System.out.println(new Method1().maxArea(height));
        System.out.println(new Method2().maxArea(height));
    }
}
