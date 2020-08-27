package AlexLee_youtube;

import java.util.ArrayList;

public class ForEachLoops {
    public static void main(String[] args) {

        String [] cars  ={"BMW", "Lexus", "Ferrari"};

        for (String car: cars) {
            System.out.println(car);
        }

        int [] ages = {23, 43, 56, 25, 54};

        for (int age: ages) {
            if (age > 35) System.out.println(age);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);

        for (int num: numbers) {
            System.out.println(num);
        }

    }
}
