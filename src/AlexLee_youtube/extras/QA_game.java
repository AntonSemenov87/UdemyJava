package AlexLee_youtube.extras;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class QA_game {
    public static void main(String[] args) {

        System.out.println("Enter your question:");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        scanner.close();

        Random randomNum = new Random();
        int r = randomNum.nextInt(5);


        HashMap<Integer, String> prediction = new HashMap<>();
        prediction.put(0, "As I see it - YES");
        prediction.put(1, "Don't count on it");
        prediction.put(2, "Looks not so good");
        prediction.put(3, "Signs point to yes");
        prediction.put(4, "Maybe yes, maybe no");

        System.out.println(prediction.get(r));


    }
}
