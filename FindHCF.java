// To find the gcd of two numbers, we can use the Euclidean algorithm, which is an efficient method for computing the greatest common divisor (GCD) of two integers. The algorithm is based on the principle that the GCD of two numbers also divides their difference.

import java.util.Scanner;  
public class FindHCF {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter first number: ");  
        int num1 = sc.nextInt();  
        System.out.print("Enter second number: ");  
        int num2 = sc.nextInt();  
        
        int hcf = findHCF(num1, num2);  
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);  
        
        sc.close();
    }  
    
    public static int findHCF(int a, int b) {  
        while (b != 0) {  
            int temp = b;  
            b = a % b;  
            a = temp;  
        }  
        return a;  
    }  
}