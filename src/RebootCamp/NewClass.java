package RebootCamp;

import java.util.HashMap;

public class NewClass {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("C", 4);
        map.put("C", 3);
        map.put(null, 5);
        System.out.println(map);

        for (Integer each: map.values()) {
            System.out.println(each);
        }

    }
}
