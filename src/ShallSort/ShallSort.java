package ShallSort;

/**
 * Created by sam on 23/6/19.
 */
public class ShallSort {

    public static void main(String[] args) {

        int arr[] = {90, 30, 20, 0, -5, -19, -70, 23};

        int gap = arr.length / 2;

        while (gap > 0) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int tem = arr[i];
                while (j >= gap && tem < arr[j - gap]) {
                    arr[j] = arr[j - gap];
                    j = j - gap;
                }
                arr[j] = tem;
            }
            gap = gap / 2;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
