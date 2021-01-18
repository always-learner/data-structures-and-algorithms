package Recursion;

/**
 * @author : Shyam Sharma
 * @created : 16/01/21
 **/
public class StringPailndrome {

    public static void main(String[] args) {
        final String stringValue = "abc";
        System.out.println(isPailndrome(0, stringValue));
    }

    private static boolean isPailndrome(int curentcharPos, String stringValue) {
        if (curentcharPos >= (stringValue.length() - (curentcharPos + 1))) {
            return true;
        }
        return (stringValue.charAt(curentcharPos) == stringValue.charAt(stringValue.length() - (curentcharPos + 1))
                && isPailndrome(curentcharPos + 1, stringValue));
    }

}
