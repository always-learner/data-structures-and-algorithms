package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 21/01/21
 **/
public class FrequenciesInSortedArray {
    public static void main(String[] args) {
        int[] arr = {10,10,10};
        int count = 1;
        int i = 1;
        for (; i < arr.length; i++) {
            if (arr[i] != arr[i-1]){
                System.out.println(arr[i-1] +" "+count);
                count = 1;
            } else {
                count++;
            }
        }
        if (arr.length == i){
            System.out.println(arr[i-1] +" "+count);
        }
    }
}
