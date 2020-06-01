package FirstSteps;

public class LogicalOrOperator {
    public static void main(String[] args) {
        int topScore = 100;
        int secondScore = 60;

        if ( (topScore > 90) || (secondScore >= 60) ) {
            System.out.println("You hit both scores");
        }
    }
}
