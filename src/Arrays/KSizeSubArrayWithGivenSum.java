package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 04/02/21
 * Sliding window problem #2
 * Find the the sub array of size k with a given sum if exists return true else return false
 **/
public class KSizeSubArrayWithGivenSum {

    public static void main(String[] args) {
        int[] arr = {-5,-10,6,90,3};
        int k = 3;
        int sum= -9;
        System.out.println(doesSumExists(arr, k, sum));
    }

    public static boolean doesSumExists(int[] arr, int k, int sum){
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        if (currentSum == sum){
            return true;
        }
        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i];
            currentSum -= arr[i - k];
            if (currentSum == sum)
                return true;
        }
        return false;
    }
}
