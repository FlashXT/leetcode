package Problems.P012_IntegertoRoman;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/2 7:58;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public String intToRoman(int num) {
        int [] values = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String [] roman = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder sb = new StringBuilder();

        for(int i = values.length-1;i >=0 ;i--) {
            while(num >= values[i]){
                num -= values[i];
                sb.append(roman[i]);
            }
        }
        return sb.toString();
    }
}
