package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 29/01/21
 **/
public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr = {-1,-2,9,-1,-2};
        int[] maxArr = new int [arr.length];
        int maxResult = arr[0];
        maxArr[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxArr[i] = Math.max(maxArr[i-1] + arr[i], arr[i]);
            System.out.println("max arr "+maxArr[i]);
            maxResult = Math.max(maxArr[i], maxResult);
            System.out.println("Max res "+maxResult);
        }

        System.out.println(maxResult);
    }
}
