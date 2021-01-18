package Recursion;

/**
 * @author : Shyam Sharma
 * @created : 18/01/21
 **/
public class StringPertutaions {

    public static void main(String[] args) {
        String input = "ABC";
        String output ="";
        printAllPermutations(input,output);
    }

    private static void printAllPermutations(String input, String output) {
        if (input.length() == 0){
            System.out.println(output);
            return;
        }
        printAllPermutations(input.substring(1), output.concat(String.valueOf(input.charAt(0))));
        printAllPermutations(input.substring(1), output.concat(String.valueOf(input.charAt(1))));
    }
}
