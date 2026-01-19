public class BubbleSort{
    public static void bubbleSort(int[] arr) {
        int n=arr.length;
        boolean swapped;

        for(int i=0;i<n-1;i++){
            swapped=false;

            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]) {
                    //Swap arr[j] and arr[j+1]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }

            //If no swapping occurred in this pass, array is sorted
            if(!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={24,43,62,21,93,43};
        System.out.println("Original array:" + java.util.Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array:" + java.util.Arrays.toString(arr));
    }
}