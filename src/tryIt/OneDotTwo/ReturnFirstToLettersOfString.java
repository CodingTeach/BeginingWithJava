package tryIt.OneDotTwo;

public class ReturnFirstToLettersOfString {
    public static void main(String[] args){
        System.out.print(returnFirstToLettersOfString("Hello World"));
        System.out.print(returnFirstToLettersOfString("llo World"));
        System.out.print(returnFirstToLettersOfString("o World"));
        System.out.print(returnFirstToLettersOfString("World"));
        System.out.print(returnFirstToLettersOfString("rld"));
        System.out.print(returnFirstToLettersOfString("d!"));
    }

    private static String returnFirstToLettersOfString(String string) {
        return string.substring(0,2);
    }
}
