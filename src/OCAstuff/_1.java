package OCAstuff;

import java.util.ArrayList;
import java.util.List;

public class _1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(1);
        System.out.println(list);
    }
}
