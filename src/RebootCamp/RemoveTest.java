package RebootCamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveTest {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 3) {
                System.out.println("got it " + arr[i]);
            }
        }

        System.out.println("============ ArrayList ============");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4 ) {
                list.remove(i);
            }
        }
        System.out.println(list);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if (it.next() < 4) {
                it.remove();
            }
        }

        System.out.println(list);

    }
}
