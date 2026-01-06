//This program demonstrates to reverse words in a given string

public class ReverseWords{
    public static void main(String[] args){
        String sentence="Java Coding Interview";
        String[] words=sentence.split(" ");
        StringBuilder result=new StringBuilder();

        for(String word: words) {
            StringBuilder reversedWord=new StringBuilder(word).reverse();
            result.append(reversedWord).append(" ");
        }
        System.out.println("Original" + sentence);
        System.out.println("Reverse words: " + result.toString().trim());
    }
}