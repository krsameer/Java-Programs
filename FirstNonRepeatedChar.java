import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChar{
    public static char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> charCounts = new HashMap<>();

        for(char c:str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c,0)+1);
        }

        for(char c:str.toCharArray()) {
            if(charCounts.get(c) ==1) {
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str="BellaCiao";
        char result=findFirstNonRepeatedChar(str);

        if(result !='\0') {
            System.out.println("First non repeated character is : " + result);
        } else{
            System.out.println("No non repeated character found");
        }
    }
}