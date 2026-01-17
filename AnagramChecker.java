//Two strings containing same characters with same frequency but different order.
//Example: "listen" and "silent" , "triangle" and "integral"

// Approach used
// 1.Sort both strings and compare
// 2.Count character frequencies
// 3.Use character array for counting

public class AnagramChecker{
    public static boolean areAnagrams(String str1, String str2) {
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();

        if(str1.length()!=str2.length()) {
            return false;
        }

        char[] charArray1=str1.toCharArray();
        char[] charArray2=str2.toCharArray();
        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);
        return java.util.Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String s1="Listen";
        String s2="Silent";
        System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are anagrams: " + areAnagrams(s1, s2));
    }
}