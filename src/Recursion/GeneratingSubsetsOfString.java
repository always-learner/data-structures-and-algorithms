package Recursion;

/**
 * @author : Shyam Sharma
 * @created : 17/01/21
 **/
public class GeneratingSubsetsOfString {

    public static void main(String[] args) {
        final String input = "abcd";
        String output = "";
        printSubSets(input, output, 0);
    }

    private static void printSubSets(String input, String output, int currentChar) {
        if (input.length() == currentChar){
            System.out.println(output);
        } else {
            printSubSets(input, output, currentChar+1);
            output = output.concat(String.valueOf(input.charAt(currentChar)));
            printSubSets(input, output, currentChar+1);
        }
    }
}
