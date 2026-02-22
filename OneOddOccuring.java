// Given an array of arr[] positive integers where all numbers occur even number of times except one number which occurs odd number of times. Return that number.

public class OneOddOccuring {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3};
        int result = findOddOccurring(arr);
        System.out.println("The number that occurs odd number of times is: " + result);
    }

    public static int findOddOccurring(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; 
        }
        return result;
    }
}