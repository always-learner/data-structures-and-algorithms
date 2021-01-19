package Recursion;

import java.util.ArrayList;

/**
 * @author : Shyam Sharma
 * @created : 19/01/21
 **/
public class LuckyNumber {
    static int counter = 2;

    public static void main(String[] args) {
        System.out.println(solve(0, 10));
    }
    // Return True if the given number is a lucky number else return False

    public static boolean solve(int currentIdx, int n){

        if(n < counter){
            return true;
        }
        if (currentIdx + counter -1 >= n){
            counter = counter +1;
            currentIdx = 0;
        } else {
            if (currentIdx + counter  == n){
                return false;
            }
            n--;
            currentIdx = currentIdx + counter-1;
        }
        return solve(currentIdx, n);

    }
}
