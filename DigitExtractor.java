public class DigitExtractor{
 // 1st method-Using regex
    public static String extractDigitsRegex(String input) {
        return input.replaceAll("[^0-9]","");
    }


// 2nd method-Using Character.isDigit()
    public static String extractDigitsManual(String input) {
        StringBuilder result= new StringBuilder();

        for(char c:input.toCharArray()) {
            if(Character.isDigit(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String alphanumeric="noinwd12bhj2b43kb2b3723jhbbjhbuj13318j";
        System.out.println("The given original String is: " + alphanumeric);
        System.out.println("Extracted digits(regex):" + extractDigitsRegex(alphanumeric));
        System.out.println("Extracted digits(manual):" + extractDigitsManual(alphanumeric));
    }
}