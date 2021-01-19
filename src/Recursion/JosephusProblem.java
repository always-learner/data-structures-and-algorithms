package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author : Shyam Sharma
 * @created : 17/01/21
 **/
public class JosephusProblem {

    public static void main(String[] args) {
        int k= 3;
        ArrayList arrayList = new ArrayList(Arrays.asList(1,2,3,4,5));
        int currentIndex= 0;
        System.out.println(kill(arrayList, k, currentIndex));
    }

    private static Integer kill(ArrayList<Integer> arrayList, int k, int currentIndex) {
        if (arrayList.size() == 1){
            return arrayList.get(0);
        } else {
            currentIndex = (currentIndex + k-1) % arrayList.size();
            arrayList.remove(currentIndex);
            return kill(arrayList, k, currentIndex);
        }
    }
}
