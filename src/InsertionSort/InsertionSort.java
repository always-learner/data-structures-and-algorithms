package InsertionSort;

/**
 * Created by sam on 23/6/19.
 */
public class InsertionSort {

    public static void main(String[] args) {

        int arr[] = {15,72,8,-10,-8,-30,50};

        for(int i=1; i< arr.length;i++){
            int j = i;
            int temp  = arr[i];
            while(j > 0 && temp < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }

        for(int i = 0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
