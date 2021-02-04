package Arrays;

/**
 * @author : Shyam Sharma
 * @created : 23/01/21
 **/
public class RainWaterTrappingProblem {
    public static void main(String[] args) {
        int[] arr = {3,0,1,2,5};
        int[] lmax = new int[arr.length];
        int[] rmax = new int[arr.length];
        initLMax(arr, lmax);
        initRMax(arr, rmax);
        collectWater(arr, lmax, rmax);
    }

    private static void collectWater(int[] arr, int[] lmax, int[] rmax) {
        int water = 0;
        for (int i= 1; i < arr.length-1; i++){
            water += (Math.min(lmax[i], rmax[i]) - arr[i]);
        }
        System.out.println(water);
    }

    private static void initLMax(int[] arr, int[] lmax) {
        int currentLMax = arr[0];
        lmax[0] = currentLMax;
        for (int i=1; i< arr.length; i++){
            if (currentLMax <arr[i]){
                currentLMax = arr[i];
            }
            lmax[i] = currentLMax;
        }
    }

    private static void initRMax(int[] arr, int[] rmax) {
        int currentRMax = arr[arr.length-1];
        rmax[arr.length-1] = currentRMax;
        for (int i=arr.length-1; i >=0; i--){
            if (currentRMax <arr[i]){
                currentRMax = arr[i];
            }
            rmax[i] = currentRMax;
        }
    }
}
