public class StringLengthWithoutMethod{
    public static void main(String[] args){
        String str="rvcebangalore";
        int length=0;

        try{
            while(true){
                str.charAt(length);
                length++;
            }
        } catch(StringIndexOutOfBoundsException e){
            //Reached the end of string
        }
        System.out.println("Length of the given string is: " + length);
    }
}