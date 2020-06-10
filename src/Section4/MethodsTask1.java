package Section4;

public class MethodsTask1 {
    public static void main(String[] args) {

        int position = calculateHighScorePosition(25);
        displayHightScorePosition("Anton", position);

        position = calculateHighScorePosition(900);
        displayHightScorePosition("Bob", position);

    }

    public static void displayHightScorePosition (String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position +
                " on the high score table");
    }

    public static int calculateHighScorePosition (int playerScore) {
        int position = 4;
        if (playerScore >= 1_000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
