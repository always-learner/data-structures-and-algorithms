package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 24/01/21
 **/
public class MaxLengthEvenOddSubArray {
    public static void main(String[] args) {
        int maxCount = 1;
        int currentMax = 1;
        int[] arr = {5,10,20,6,3,8};

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i]+ arr[i-1]) % 2 != 0){
                currentMax ++;
                maxCount = Math.max(currentMax, maxCount);
            } else {
                currentMax = 1;
            }
        }
        System.out.println(maxCount);
    }
}
