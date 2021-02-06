package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 04/02/21
 **/
public class NBonacciNumbers {

    public static void main(String[] args) {
        int n = 5, m = 15;
        System.out.println();
        int sum = 1;
        int[] arr = new int[m];

        int i=0;
        for (; i < n-1; i++) {
            arr[i] = 0;
        }
        arr[i] = 1;

        for (int j = i+1; j < m; j++) {
            arr[j] = sum;
            sum += arr[j];
            sum -= arr[j -n];
        }

        for (int j = 0; j <m; j++) {
            System.out.print(arr[j] +" ");
        }

    }

}
