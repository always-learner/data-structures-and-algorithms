package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 19/01/21
 **/
public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4    };
        reverseArray(arr, 0, arr.length -1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void reverseArray(int[] arr, int i, int i1) {
        if (i >= i1){
            return;
        }
        int var = arr[i];
        arr[i] = arr[i1];
        arr[i1] = var;
        reverseArray(arr, i+1, i1-1);
    }
}
