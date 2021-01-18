package Recursion;

/**
 * @author : Shyam Sharma
 * @created : 17/01/21
 **/
public class TowerOfHanoi {

    public static void main(String[] args) {
        int n = 1;
        String source = "A", helper = "B", Destination = "C";
        moveDisk(n, source, Destination, helper);
    }

    private static void moveDisk(int n, String source, String destination, String helper) {
        if (n == 1) {
            System.out.println("Moving plate " + n + " from " + source + " to " + destination);
            return;
        }
        moveDisk(n-1, source, helper, destination);
        System.out.println("Moving plate " + n + "from " + source + " to " + destination);
        moveDisk(n-1, helper, destination, source);
    }
}
