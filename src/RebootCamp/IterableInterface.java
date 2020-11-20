package RebootCamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableInterface {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        // remove using for loop
        for (int i = 0; i <= list.size()-1; i++) {
            if (list.get(i) < 5) {
                list.remove(i);
            }
        }

        System.out.println(list); // [2, 4, 5, 6, 7, 8, 9, 10] --> removes only 1 element

        System.out.println("===============================");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf( p -> p < 5 );
        System.out.println(list2);

        System.out.println("===============================");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Iterator <Integer> it = list3.iterator();
        while (it.hasNext()) {
            if (it.next() < 5 ) {
                it.remove();
            }
        }
        System.out.println(list3);




    }
}
