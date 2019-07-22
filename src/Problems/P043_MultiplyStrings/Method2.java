package Problems.P043_MultiplyStrings;

import java.util.Arrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/22 15:33;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method2 {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0"))
            return "0";
        int n1 = num1.length();
        int n2 = num2.length();
        int [] pos = new int[n1+n2];
        for(int i = n1-1; i >=0;i--){
            for(int j = n2 -1 ;j >=0 ;j--){
                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum = mul+pos[i+j+1];
                pos[i+j] += sum/10;
                pos[i+j+1] = sum%10;
                System.out.println(Arrays.toString(pos));
            }
            System.out.println("========================");
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < pos.length;i++){
            if(i==0 && pos[i]==0){
                continue;
            }
            sb.append(pos[i]);
        }
        return sb.toString();
    }

}
