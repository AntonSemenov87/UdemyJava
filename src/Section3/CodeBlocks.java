package Section3;

public class CodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 200;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000)  {
            System.out.println("Your score was less than 5000 but more than 1000");
        } else {
            System.out.println("Score is out of range");
        }

        // System.out.println("This was executed as well");



        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final score is " + finalScore);
        }



        // --------------------------------------------------------------------

        boolean newGameOver = true;
        int newScore = 10_000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if (newGameOver == true) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("new Final score is " + finalScore);
        }
    }
}
