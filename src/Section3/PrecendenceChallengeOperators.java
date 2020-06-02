package Section3;

public class PrecendenceChallengeOperators {
    public static void main(String[] args) {
        double one = 20.00;
        double two = 80.00;
        double three = (one + two) * 100.00;
        double remainder = three % 40.00;
        System.out.println(three);
        System.out.println(remainder);

        boolean hasNoRemainder = remainder == 0 ? true : false;
        System.out.println(hasNoRemainder);

        if (!hasNoRemainder) System.out.println("Got some remainder");

    }
}
