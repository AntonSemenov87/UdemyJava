package Section3;

public class LogicalAndOperator {
    public static void main(String[] args) {
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondScore = 81;
        if (topScore > secondScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
