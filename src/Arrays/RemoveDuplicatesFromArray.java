package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 20/01/21
 **/
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,2,2,2,2,3,3,4,4,4,5};
        int i1 = removeDuplicates(arr, 0, 0);
        for (int i = 0; i <i1 ; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int removeDuplicates(int[] src, int currentIdx, int insertAt) {
        if (currentIdx == src.length){
            return insertAt;
        }
        if (insertAt == 0 || src[insertAt-1] != src[currentIdx]){
            src[insertAt] = src[currentIdx];
            insertAt++;
        }
        currentIdx++;
        return removeDuplicates(src, currentIdx, insertAt);
    }
}
