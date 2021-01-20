package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 19/01/21
 **/
public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arrb = {0,3,5,2,1};
        System.out.println("Arrays 1 is sorted "+isArraySorted(arr, 1));
        System.out.println("Arrays 2 is sorted "+isArraySorted(arrb, 1));
    }

    private static boolean isArraySorted(int[] arr, int i) {
        if (i == arr.length){
            return true;
        }
        if (arr[i-1] > arr[i]){
            return false;
        }
        return isArraySorted(arr, i+1);
    }
}
