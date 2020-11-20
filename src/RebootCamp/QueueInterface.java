package RebootCamp;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {

        Queue<Integer> q1 = new ArrayDeque<>(); // first in first out order
        q1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,7,5,4,2)); // allows duplicates
        System.out.println(q1);
        q1.poll(); // FIFO
        System.out.println(q1);
        q1.poll(); // FIFO
        System.out.println(q1);

    }
}
