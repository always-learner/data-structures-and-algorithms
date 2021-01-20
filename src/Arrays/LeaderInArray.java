package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 20/01/21
 **/
public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {30,10,10,10};
        int currentLeader = arr[arr.length -1];
        for (int i= arr.length-2; i >= 0; i--){
            if (arr[i] > currentLeader){
                System.out.println(currentLeader);
                currentLeader = arr[i];
            }
        }
        System.out.println(currentLeader);
    }
}
