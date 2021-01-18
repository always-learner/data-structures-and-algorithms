package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : Shyam Sharma
 * @created : 17/01/21
 **/
public class JosephusProblem {

    public static void main(String[] args) {
        int k= 3;
        ArrayList arrayList = new ArrayList(Arrays.asList(1,2,3,4,5));
        System.out.println(kill(arrayList, k));
    }

    private static Integer kill(ArrayList<Integer> arrayList, int k) {
        if (arrayList.size() == 1){
            return arrayList.get(0);
        } else {
            arrayList.remove(k-1);
            return kill(arrayList, ((k +k) % arrayList.size()));
        }
    }
}
