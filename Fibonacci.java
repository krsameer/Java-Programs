public class Fibonacci{
    public static void main(String[] args) {
        int a=0,b=1;
        int n=10; //Printing 10 numbers here
        System.out.println(a + "" + b + "");
        for(int i=2;i<n;i++) {
            int c=a+b;
            System.out.println(c + "");
            a=b;
            b=c;
        }
    }
}