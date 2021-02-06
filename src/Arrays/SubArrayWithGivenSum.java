package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 04/02/21
 * Find that is there any sub array exists who's sum equal to the given sum
 * given array of non-neg numbers
 **/
public class SubArrayWithGivenSum {

    public static void main(String[] args) {
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int Sum = 33;

        int i;
        int currentSum = arr[0];
        int lastElement = 0;

        for ( i = 1; i <= arr.length; i++) {
            while(currentSum > Sum && lastElement < i){
                currentSum = currentSum - arr[lastElement];
                lastElement++;
            }
            if (currentSum == Sum){
                System.out.println("Exists sum from index "+(lastElement + 1) +" to "+i);
                break;
            }
            if (arr.length > i)
            currentSum += arr[i];
        }
        if (i == arr.length){
            System.out.println("Sum does not exists ");
        }
    }
}
