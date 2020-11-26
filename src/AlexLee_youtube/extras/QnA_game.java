package AlexLee_youtube.extras;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class QnA_game {
    public static void main(String[] args) {
        System.out.println("Please enter your question:");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        scanner.close();

        Random random = new Random();
        int i = random.nextInt(5);

        HashMap <Integer, String> predictions = new HashMap<>();
        predictions.put(1, "Yes");
        predictions.put(2, "No");
        predictions.put(3, "Maybe");
        predictions.put(4, "You know better");
        predictions.put(5, "Nope for sure");

        System.out.println(predictions.get(i));
    }
}
