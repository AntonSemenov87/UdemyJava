package Section4;

public class Methods {
    public static void main(String[] args) {

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        System.out.println("Running first example:");
        calculateScore(true, 800, 5, 100);
        System.out.println("Running second example:");
        calculateScore(true, 10_000, 8, 200);


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
