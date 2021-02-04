package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 21/01/21
 **/
public class StockBuySellProblem {
    public static void main(String[] args) {
            int[] arr = {10,20,30};
            int currentProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]){
                currentProfit += arr[i] - arr[i-1];
            }
        }
        System.out.println(currentProfit);
    }
}
