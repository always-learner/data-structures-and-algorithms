package Recursion;

import java.util.Arrays;

/**
 * @author : Shyam Sharma
 * @created : 17/01/21
 **/
public class SubsetSumProblem {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum = 9;
        int currentIdx = 0;
        System.out.println(getSumOfSubSetCount(arr, sum, currentIdx));
    }

    private static int getSumOfSubSetCount(int[] arr, int sum, int currentIdx) {
        if (currentIdx == arr.length){
            if (sum == 0){
                return 1;
            }
            return 0;
        }
        return getSumOfSubSetCount(arr, sum, currentIdx +1) +
        getSumOfSubSetCount(arr, sum - arr[currentIdx], currentIdx +1);
    }

}
