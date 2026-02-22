// This program finds the second largest number in an array of integers. The algorithm iterates through the array, keeping track of the largest and second largest numbers found so far
// The time complexity of this algorithm is O(n), where n is the number of elements in the array, because we need to traverse the array once to find the second largest number.
// The space complexity is O(1) because we are using only a constant amount of extra space to store the largest and second largest numbers, regardless of the size of the input array.

public class FindingSecondLargest{
    public static int findSecondLargest(int[] arr) {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }
            else if(num>secondLargest && num !=largest) {
                secondLargest=num;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args){
        int[] numbers={2,5,6,64,6,9};
        System.out.println("Second largest number: "+findSecondLargest(numbers));
    }
}