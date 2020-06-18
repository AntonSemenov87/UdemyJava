package Section5;

public class LastDigitChecker_task {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit (int numA, int numB, int numC) {
        if (isValid(numA) && isValid(numB) && isValid(numC)) {
            numA = numA % 10;
            numB = numB % 10;
            numC = numC % 10;

            if (numA == numB || numA == numC || numB == numC) return true;
        }
            return false;
    }

    public static boolean isValid (int number) {
        if (number < 10 || number > 1000) return false;
        return true;
    }
}
