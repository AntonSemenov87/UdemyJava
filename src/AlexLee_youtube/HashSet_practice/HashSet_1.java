package AlexLee_youtube.HashSet_practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_1 {
    public static void main(String[] args) {

        // in HashSet you cannot rely on position of elements (NOT ordered)

        HashSet<Integer> hashbrowns = new HashSet<Integer>();
        hashbrowns.add(13);
        hashbrowns.add(24);
        hashbrowns.add(5);
        hashbrowns.add(33);
        hashbrowns.add(72);
        hashbrowns.add(1);

        hashbrowns.remove(13);

        System.out.println(hashbrowns);  // [33, 1, 5, 24, 72]

        Object [] h = hashbrowns.toArray();
        System.out.println(h[0]); // 33

        System.out.println(hashbrowns.hashCode()); // 135 - just random locator in memory or smth like that

        System.out.println("===========Time for iterator==============\n");

        Iterator <Integer> it = hashbrowns.iterator(); // with help of iterator loop through each element
        while (it.hasNext()) {
            System.out.println(it.next());
        }



    }
}
