package RandomStuff;

import java.util.HashMap;

public class HashMap_practice3 {
    public static void main(String[] args) {
        HashMap<String, String> table = new HashMap<>();
        // creating table of emails and passwords into table (map)
        for (int i = 0; i < 5; i++) {
            table.put("tester"+i+"@gmail.com", "JavaTester"+i);
        }
        System.out.println(table);

        boolean hackerPresent = table.containsKey("tester4@gmail.com");
        System.out.println(hackerPresent);

        System.out.println(table.size());
        table.remove("tester4@gmail.com");

        System.out.println(table.size());

        System.out.println(table.keySet());
        System.out.println(table.values());
    }
}
