package SelectionSort;

/**
 * Created by sam on 22/6/19.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {2, 35, 65, -10, 7, 4, 8, 1};
        int unsortedIndex = arr.length - 1;

        while (unsortedIndex > 0) {
            int largestNo = 0;
            for (int i=1;i< unsortedIndex;i++){
                if (arr[largestNo] < arr[i]){
                    largestNo = i;
                }
            }
            int temp = arr[unsortedIndex];
            arr[unsortedIndex] = arr[largestNo];
            arr[largestNo] = temp;
            unsortedIndex--;
        }

        for (int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
