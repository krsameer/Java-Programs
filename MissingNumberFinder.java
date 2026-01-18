public class MissingNumberFinder{
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum=n*(n+1)/2;

        int actualSum=0;
        for(int num:arr){
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] numbers={1,2,4,6,3,7,8};
        int n=8;  //Range
        System.out.println("Missing number: " + findMissingNumber(numbers, n));

    }
}