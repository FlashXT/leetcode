package Problems.P068_TextJustification;

public class Main {
    public static void main(String [] args){
        String [] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        new Method1().fullJustify(words,maxWidth);
    }

}
