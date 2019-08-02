package Problems.P072_EditDistance;

public class Main {
    public static void main(String [ ]args){
            String word1 = "horse";
            String word2 = "ros";
            System.out.println(new Method3().minDistance(word1,word2));
            System.out.println(new Test().editDistance(word1,word2));
    }

}
