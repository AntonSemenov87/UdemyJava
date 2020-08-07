package AlexLee_youtube.HashSet_practice;

import java.util.HashSet;

public class HashSet_1 {
    public static void main(String[] args) {
        HashSet<Integer> hashbrowns = new HashSet<Integer>();
        hashbrowns.add(13);
        hashbrowns.add(24);
        hashbrowns.add(5);

        hashbrowns.remove(13);
        System.out.println(hashbrowns);

    }
}
