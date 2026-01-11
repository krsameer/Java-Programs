public class EvenOddIndexElements{
    public static void main(String[] args){
        String[] elements={"Java","Docker","Kubernetes","Github","RVCollege","Ramaih","DSCE","Christ"};
        System.out.println("Even index elements are: ");
        for(int i=0;i<elements.length;i+=2){
            System.out.println(elements[i] + " ");
        }
        System.out.println("Odd index elements are: ");
        for(int i=1;i<elements.length;i+=2){
            System.out.println(elements[i] + " ");
        }
    }
}