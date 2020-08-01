package RandomStuff.HashMap_practice;

import java.util.HashMap;

public class HashMap_practice1 {
    public static void main(String[] args) {

        // HashMaps don't have an order, all key+values are not in ordered list
        HashMap <String, Integer> random = new HashMap <String, Integer>();
        random.put("a", 0);
        random.put("b", 1);
        random.put("c", 2);
        random.put("d", 3);
        System.out.println(random);
        System.out.println("================================");

        HashMap <String, String> userPass = new HashMap<String, String>();
        userPass.put("altrooist", "Test123");
        userPass.put("nikita61", "Qwerty123");
        userPass.put("lmao", "funnybunny1908");
        userPass.put("dontRemove", "removeMeNot");
        System.out.println(userPass);
        System.out.println();

        userPass.remove("dontRemove");
        System.out.println(userPass);

        System.out.println(userPass.containsValue("lmao")); // this is Key, so false
        System.out.println(userPass.containsKey("lmao")); // this is Key, so true
        System.out.println(userPass.containsKey("hahaha") || userPass.containsValue("hahaha")); // false, none of these exist

        String usernameToCheck = "nikiTA61";
        if (userPass.containsKey(usernameToCheck.toLowerCase())) {
            System.out.println("user " + usernameToCheck + " exists");
        } else {
            System.out.println("User doesn't exist");
        }

        System.out.println("size of HashMap: " + userPass.size()); // 3

        System.out.println(userPass.replace("lmao", "lmfao")); // this will print funnybunny1908
        System.out.println(userPass); // {nikita61=Qwerty123, altrooist=Test123, lmao=lmfao}


        // Get all values:
        System.out.println(userPass.values());
        // Get all keys:
        System.out.println(userPass.keySet());

    }
}
