package Problems.P058_LengthofLastWord;
//方法一：对字符串按空格进行分割，然后计算最后一个子串的长度
public class Method1 {
    public int lengthOfLastWord(String s) {
//        if(s.length() == 0) return 0;
        String [] str = s.split(" ");
        if(str.length ==0) return 0;
        return str[str.length-1].length();
    }
}
