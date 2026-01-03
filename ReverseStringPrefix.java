//Leetcode Biweekly Contest 173 first question

// Given String s, and integer k.
// Reverse the first k characters of s and return the final String

// Ex1-  s = abcd, k = 2
// Output = bacd

// Ex2-  s = xyz, k=3
// Output = zyx

// Ex3-  s = hey, k=1
// Output=hey



public class ReverseStringPrefix {

    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder(s.substring(0, k));
        sb.reverse();
        sb.append(s.substring(k));
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseStringPrefix reverse = new ReverseStringPrefix();

        System.out.println(reverse.reversePrefix("abcd", 2));
        System.out.println(reverse.reversePrefix("xyz", 3));
        System.out.println(reverse.reversePrefix("hey", 1));
    }
}