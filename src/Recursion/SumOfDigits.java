package Recursion;

/**
 * @author : Shyam Sharma
 * @created : 16/01/21
 **/
public class SumOfDigits {

    public static void main(String[] args) {
        int number = 121;
        System.out.println(sumOfDigits(number));
    }

    private static int sumOfDigits(int number) {
        if (number == 0){
            return 0;
        }
        return (number %10 + sumOfDigits(number/10));
    }
}
