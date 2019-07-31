package Problems.P067_AddBinary;

public class Method1 {
    public String addBinary(String a, String b) {
        //先将两个字符串长度补齐
        StringBuilder str1 = new StringBuilder(a);
        StringBuilder str2 = new StringBuilder(b);
        int len = str1.length() -str2.length();
        if(len > 0) {
            for(int i = 0; i< len;i++)
                str2.insert(0,"0");
        }
        if(len <0){
            for(int i = 0; i< -len;i++)
                str1.insert(0,"0");
        }
        int  carry = 0;
        StringBuilder res = new StringBuilder();

        while(str1.length() > 0 || str2.length() > 0){

            int temp1 = Integer.valueOf(str1.charAt(str1.length()-1)-'0');
            int temp2 = Integer.valueOf(str2.charAt(str1.length()-1)-'0');
            str1.deleteCharAt(str1.length()-1);
            str2.deleteCharAt(str2.length()-1);

            res.insert(0,temp1^temp2^carry);
            carry = (temp1 & temp2)|(carry&(temp1^temp2));
       }

        if(carry!=0)
            res.insert(0,carry);
        System.out.println(res);
        return res.toString();
    }

}
