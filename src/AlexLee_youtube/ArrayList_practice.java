package AlexLee_youtube;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_practice {
    public static void main(String[] args) {

        // arrays:
        String [] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        //==================================================================//


        // ArrayList
        ArrayList fruitList = new ArrayList();
        fruitList.add("Banana");
        fruitList.add("Pineapple");
        fruitList.add("Kiwi");
        fruitList.add("Watermelon");
        System.out.println(fruitList); // [Banana, Pineapple, Kiwi, Watermelon]
        fruitList.remove("Banana");
        System.out.println(fruitList); // [Pineapple, Kiwi, Watermelon]
        System.out.println(fruitList.contains("Kiwi")); // true
        fruitList.clear();
        System.out.println(fruitList); // []
















    }
}
