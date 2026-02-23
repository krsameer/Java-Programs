// This program moves all zeroes in an array to the end while maintaining the relative order of non-zero elements. The algorithm iterates through the array, placing non-zero elements at the front and filling the rest with zeroes.
// The time complexity of this algorithm is O(n), where n is the number of elements in the array, because we need to traverse the array once to move the non-zero elements and then fill the remaining positions with zeroes.
// The space complexity is O(1) because we are modifying the array in place and using only a constant amount of extra space for the index variable.


import java.util.Arrays;

public class MoveZeroes {
    
    public static void moveZeroes(int[] arr) {
        int index = 0; // Position to place next non-zero element
        
        // Step 1: Move all non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        
        // Step 2: Fill remaining positions with zeroes
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        
        moveZeroes(arr);
        
        System.out.println("Array after moving zeroes: " + Arrays.toString(arr));
    }
}