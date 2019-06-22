/**
 * Created by sam on 1/6/19.
 */
public class BubbleSort {

    public static void main(String args[]) {
        final int arr[] = {20,35,-16,-20,5,6,50};
        bubbleSort(arr);
        printArray(arr);
    }

    private static void bubbleSort(final int[] arr) {
        int unsortedIndex = arr.length -1;
        for(int j=0;j< arr.length;j++) {
            for (int i = 0; i < unsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            unsortedIndex--;
        }
    }

    private static void printArray(final int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
