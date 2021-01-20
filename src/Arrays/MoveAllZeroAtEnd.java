package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 20/01/21
 **/
public class MoveAllZeroAtEnd {

    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0,0,3,0,0,5};
        moveZeros(arr, 0, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void moveZeros(int[] arr, int nonZero, int next) {
        if (arr.length == next){
            return;
        }
        if (arr[next] != 0){
            int temp = arr[next];
            arr[next] = arr[nonZero];
            arr[nonZero] = temp;
            nonZero++;

        } else if (arr[nonZero] != 0){
            nonZero++;
        }
        next++;
        moveZeros(arr, nonZero, next);
    }
}
