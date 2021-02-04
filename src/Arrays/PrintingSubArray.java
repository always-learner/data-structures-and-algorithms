package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 24/01/21
 **/
public class PrintingSubArray {
    public static void main(String[] args) {
        int[] arr  = {-5,1, -2, 3, -1,2,-2};
        int[] maxIndex = new int[arr.length];
        int maxSum = arr[0];
        maxIndex[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxIndex[i] =  Math.max(maxIndex[i-1] + arr[i], arr[i]);
            maxSum = Math.max(maxSum, maxIndex[i]);
        }
        System.out.println(maxSum);
    }
}
