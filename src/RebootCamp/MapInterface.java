package RebootCamp;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {

        Map<String, Integer> mp1 = new HashMap<>();
        mp1.put("A", 1);
        mp1.put("A", 2);
        mp1.put("C", 3);
        mp1.put("D", 2);
        mp1.put("A", 3); // doesn't allow duplicates
        mp1.put(null, 5);
        mp1.put(null, 3); // accepts only 1 null, since keys cannot be duplicated, value - can
        System.out.println(mp1);

        for (Map.Entry m: mp1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        for ( int each: mp1.values()) { // to iterate valued
            System.out.println(each);
        }

        for ( String each: mp1.keySet()) { // to iterate keys
            System.out.println(each);
        }

    }
}
