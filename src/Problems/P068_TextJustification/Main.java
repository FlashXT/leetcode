package Problems.P068_TextJustification;

public class Main {
    public static void main(String [] args){
        String [] words = {"What","must","be","acknowledgment","shall","be"};
        int maxWidth = 16;
        new Method1().fullJustify(words,maxWidth);
    }

}
