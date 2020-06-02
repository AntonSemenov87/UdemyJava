package Section4;

public class Methods {
    public static void main(String[] args) {

        System.out.println("Running first example:");
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
        calculateScore(true, 800, 5, 100);
        // or: calculateScore(gameOver, score, levelCompleted, bonus);



        System.out.println("Running second example:");
//        gameOver = true;
//        score = 800;
//        levelCompleted = 5;
//        bonus = 100;
        calculateScore(true, 10_000, 8, 200);
        // or: calculateScore(gameOver, score, levelCompleted, bonus);


        System.out.println("Now this is last thing to be executed");
    }


    public static void calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore + "\n");
        }
    }

}
