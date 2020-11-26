package AlexLee_youtube.extras;

import java.util.Random;

public class RollingDice {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(6) + 1;
        System.out.println("You rolled " + i);
    }
}
