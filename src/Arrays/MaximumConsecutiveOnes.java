package Arrays;

import static java.lang.Math.max;

/**
 * @author : Shyam Sharma
 * @created : 24/01/21
 **/
public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] values = {1,1,1,1,1,1};
        int currentOneCnt = 0;
        int maxOnes = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0){
                currentOneCnt = 0;
            } else {
                currentOneCnt++;
                maxOnes = max(currentOneCnt, maxOnes);
            }
        }

        System.out.println(maxOnes);
    }
}
