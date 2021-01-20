package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 20/01/21
 **/
public class LeftRotateArrayByD {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int d = 3;
        rotateArray(arr, d);
        for (int value : arr) {
            System.out.println(value);
        }
    }

    private static void rotateArray(int[] arr, int d) {
        reverseArrayByIdx(arr, 0, d);
        reverseArrayByIdx(arr, d, arr.length);
        reverseArrayByIdx(arr, 0, arr.length);
    }

    private static void reverseArrayByIdx(int[]arr, int startIdx, int endIdx){
        while (startIdx < endIdx){
            int temp = arr[endIdx-1];
            arr[endIdx-1] = arr[startIdx];
            arr[startIdx] = temp;
            startIdx++; endIdx--;
        }
    }
}
