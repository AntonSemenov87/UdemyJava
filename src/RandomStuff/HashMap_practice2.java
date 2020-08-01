package RandomStuff;

import java.util.HashMap;
import java.util.Map;

public class HashMap_practice2 {
    static HashMap<String, Boolean> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("Kenny", true);
        map.put("Joe", false);
        System.out.println(map.get("Kenny")); // true

        if (map.containsKey("Jack")) System.out.println(1); // no print

        if (map.containsValue(Boolean.FALSE)) System.out.println(2); // yes - print

        for (String s : map.keySet()) {
            System.out.println(3); // for each key+value --> prints 3 (2 times)
        }

        for (Boolean b : map.values()) {
            System.out.println(4); // for each key+value --> prints 4 (2 times)
        }

        for (Map.Entry kv : map.entrySet()) { // ???
            System.out.println(5);
        }

        map.remove("Kenny");

        System.out.println(map);
    }
}
