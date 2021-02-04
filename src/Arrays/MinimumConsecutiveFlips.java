package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 02/02/21
 **/
public class MinimumConsecutiveFlips {

    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1,0,0,1,1,1,0};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]){
                if (arr[i]!= arr[0]){
                    System.out.print("From "+(i+1)+ " to ");
                } else {
                    System.out.println(i+1);
                }
            }
        }
        if (arr[arr.length -1] != arr[0]){
            System.out.println(arr.length);
        }
    }
}
