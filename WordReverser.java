// Split sentence into words
// Iterate from end to start
// Use space as delimiter

public class WordReverser{
    public static String reverseWords(String sentence) {
        String[] words=sentence.split("\\s+");
        StringBuilder reversed=new StringBuilder();

        for(int i=words.length-1;i>=0;i--) {
            reversed.append(words[i]);
            if(i>0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        String sentence="I am on a github challenge";
        System.out.println("Original:" + sentence);
        System.out.println("Reversed:" + reverseWords(sentence));
    }
}