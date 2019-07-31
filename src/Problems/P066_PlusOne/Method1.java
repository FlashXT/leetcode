package Problems.P066_PlusOne;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/31 17:14;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public int[] plusOne(int[] digits) {
        int [] ndigits = new int[digits.length+1];
        for(int j = digits.length-1; j>=0;j--)
            ndigits[j+1] = digits[j];
        int i = ndigits.length-1;
        int sum =  1;
        while (sum > 0){
            sum = ndigits[i]+sum;
            ndigits[i] = sum%10;
            sum = sum/10;
            i--;
        }
        if(ndigits[0] == 0){
            for(int k = 0; k < digits.length;k++)
                digits[k] = ndigits[k+1];
            return digits;
        }
        return ndigits;
    }
}
