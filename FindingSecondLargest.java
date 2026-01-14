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