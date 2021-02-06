package Arrays;

/**
 * Find the maximum sum of K consecutive numbers
 * @author : Shyam Sharma
 * @created : 04/02/21
 **/
public class SlidingWindowProblem1 {

    public static void main(String[] args) {
        int[] arr = {5,-10,6,90,3};
        int k =2;

        int sum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        maxSum = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i-k];
            sum = sum + arr[i];
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);

    }
}
