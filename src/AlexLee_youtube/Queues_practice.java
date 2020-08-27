package AlexLee_youtube;


import java.util.LinkedList;
import java.util.Queue;

public class Queues_practice {
    public static void main(String[] args) {

        Queue <String> bbqLine = new LinkedList<>();
        bbqLine.add("Jackson");
        bbqLine.add("Tyreek");
        bbqLine.add("Susan");
        System.out.println(bbqLine);

        // bbqLine.poll(); // removing 1st in line --> Jackson
        System.out.println(bbqLine.poll());

        System.out.println(bbqLine.peek()); // to see who is next one in line

        System.out.println(bbqLine);
        System.out.println("\n");



        Queue <String> q = new LinkedList();
        q.add("A");
        q.add("B");
        q.add("C");
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.contains("G"));
        System.out.println(q.contains("C"));

        System.out.println(q.toArray()[1]); // B
    }
}
