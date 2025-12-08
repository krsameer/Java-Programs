import java.util.*;

public class StringReversal{
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter here: ");
    String input=sc.nextLine();
    String reverse=new StringBuilder(input).reverse().toString();
    System.out.println("The reversed String is: " + reverse);

  }
}

// It's time complexity is O(n) & is very fast in practice because it’s native and optimized.