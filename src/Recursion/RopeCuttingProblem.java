package Recursion;

import static java.lang.Math.max;

/**
 * @author : Shyam Sharma
 * @created : 16/01/21
 **/
public class RopeCuttingProblem {

    public static void main(String[] args) {
        int ropeLength = 9, allowedCtLength1=8, allowedCtLength2=1, allowedCtLength3=2;
        System.out.println(getMaximumCutFromRope(ropeLength, allowedCtLength1, allowedCtLength2, allowedCtLength3));
    }

    private static int getMaximumCutFromRope(int ropeLength, int allowedCtLength1, int allowedCtLength2, int allowedCtLength3) {
        if (ropeLength == 0){
            return 0;
        } if (ropeLength < 0){
            return -1;
        }
        int max = max(max(getMaximumCutFromRope(ropeLength - allowedCtLength1, allowedCtLength1, allowedCtLength2, allowedCtLength3),
                getMaximumCutFromRope(ropeLength - allowedCtLength2, allowedCtLength1, allowedCtLength2, allowedCtLength3)),
                getMaximumCutFromRope(ropeLength - allowedCtLength3, allowedCtLength1, allowedCtLength2, allowedCtLength3));
        return max == -1 ? max : 1 +max;

    }
}
