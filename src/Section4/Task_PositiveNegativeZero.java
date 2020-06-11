package Section4;

public class Task_PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(-5);
    }

    public static void checkNumber (int number) {
        if (number < 0) {
            System.out.println("Negative");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive");
        }
    }
}
