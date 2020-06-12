package Section4;

public class MethodOverloading {
    public static void main(String[] args) {

        int score1 = calculateScore("Tim", 500);
        System.out.println(score1);
        int score2 = calculateScore(10);
        System.out.println(score2);
        calculateScore();
    }
    public static int calculateScore (String playName, int score) {
        System.out.println("Player " + playName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore (int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore () {
        System.out.println("No player name, no player score");
        return 0;
    }

//    public static void calculateScore () {
//        System.out.println("No player name, no player score");
//    }


}
