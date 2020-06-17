package Section5;

public class FirstAndLastDigitSum_task {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(12345));
    }

    public static int sumFirstAndLastDigit (int number) {
        int sum;
        int lastDigit;
        int firstDigit;
        if (number >= 0) {
            lastDigit = number % 10;
            while (number >= 10) {
                number = number / 10;
            }
            firstDigit = number;
            sum = firstDigit + lastDigit;
            return sum;
        }
        return -1;
    }
}
