package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 24/01/21
 **/
public class MaximumSubOfCirculerSubArray {

    public static void main(String[] args) {
        int[] arr = {5, -2,3,4};
        int[] maxArray = new int [arr.length + arr.length -1];
        int maxCount = arr[0];
        maxArray[0] = arr[0];
        for (int i = 1; i < arr.length + arr.length -1; i++) {
            int arrIdx = i%arr.length;
            maxArray[i] = Math.max(maxArray[i-1] + arr[arrIdx], arr[arrIdx]);
            maxCount= Math.max(maxCount, maxArray[i]);
        }

        System.out.println(maxCount);
    }
}
