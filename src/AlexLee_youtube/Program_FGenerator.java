package AlexLee_youtube;

import java.util.HashMap;
import java.util.Scanner;

public class Program_FGenerator {
    public static void main(String[] args) {
        System.out.println("Enter first letter of your name and \n" + "day of the month you were born: ");

        Scanner scanner = new Scanner(System.in);

        String letter = scanner.nextLine().toUpperCase();
        int day = scanner.nextInt();

        HashMap<String, String> letters = new HashMap();

        letters.put("A", "Wretched");
        letters.put("B", "Deeply");
        letters.put("C", "Phenomenal");
        letters.put("D", "Grossly");

        HashMap<Integer, String> days = new HashMap();
        days.put(1, "Potent");
        days.put(2, "Sudden");
        days.put(3, "Powerful");
        days.put(4, "Flat");

        System.out.println("you are a " + letters.get(letter).toUpperCase() + " " + days.get(day).toUpperCase() + " fart");
    }
}
