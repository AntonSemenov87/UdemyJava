package AlexLee_youtube.HashSet_practice;

import java.util.HashSet;

public class HashBrowns {
    public static void main(String[] args) {

        // simple way to store data using arrays
        int [] a = {3, 5, 1};
        System.out.println(a[1]);

        // HashSet:
        HashSet <String> h = new HashSet<String>();
        h.add("lemur");
        h.add("orangutan");
        h.add("spider monkey");
        h.add("gorilla");

        h.remove("orangutan");
        // h.clear();
        System.out.println(h.size());

        System.out.println(h.contains("lemur"));
        System.out.println(h.contains("wolf"));


        System.out.println(h);
        System.out.println(h.isEmpty());

    }
}
