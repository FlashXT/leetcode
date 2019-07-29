package Problems.P058_LengthofLastWord;
//方法二：从字符串最后开始，只计算最后一个子串的长度
public class Method2 {
    public int lengthOfLastWord(String s) {
        int indexend = s.length()-1;
        while(indexend >=0 && s.charAt(indexend)==' '){
            indexend--;
        }
        int len = 0;
        while(indexend >=0 && s.charAt(indexend)!=' '){
            indexend--;
            len++;
        }
        return len;
    }
}
