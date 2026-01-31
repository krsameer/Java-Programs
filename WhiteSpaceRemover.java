public class WhiteSpaceRemover{
    public static String removeWhiteSpacesRegex(String input) {
        return input.replaceAll("\\s+", "");
    }

    public static String removeWhiteSpacesManual(String input) {
    StringBuilder result=new StringBuilder();

    for(char c:input.toCharArray()) {
    if(!Character.isWhitespace(c)) {
    result.append(c);
    }
    }
    return result.toString();
    }

    public static void main(String[] args) {
    String text="One year coding challenge";
    System.out.println("After removing spaces(regex):\"" + removeWhiteSpacesRegex(text)+"\"");
    System.out.println("After removing spaces(manual):\""+removeWhiteSpacesManual(text)+"\"");
    System.out.println("Using String Replace" + text.replace(" ",""));
    }
}