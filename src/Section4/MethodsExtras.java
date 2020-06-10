package Section4;

public class MethodsExtras {
    public static void main(String[] args) {

        int finalScore = calculateScore(true, 4, 40000, 100);
        System.out.println("Your final score is " + finalScore);


    }
    public static int calculateScore (boolean gameOver, int levelCompleted, int currentScore, int bonus) {
        if (gameOver) {
            int finalScore = currentScore + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }
}
