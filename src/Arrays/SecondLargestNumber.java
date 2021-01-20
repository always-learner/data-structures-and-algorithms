package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 19/01/21
 **/
public class SecondLargestNumber {
    public static void main(String[] args) {
        int arr[] = {1,9,60,20,5,6,7};
        System.out.println(printSecondLargest(arr, -1, -1, 0));
    }

    private static int printSecondLargest(int[] arr, int max, int smax, int current) {
        if (current == arr.length){
            return smax;
        }
        if (max < arr[current]){
            smax = max;
            max = arr[current];
        }
        if (smax < arr[current] && arr[current] < max){
            smax = arr[current];
        }
        return printSecondLargest(arr, max, smax, current+1);
    }
}
