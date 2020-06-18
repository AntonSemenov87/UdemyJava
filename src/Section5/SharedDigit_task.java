package Section5;

public class SharedDigit_task {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(123,345));
    }
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 >= 10 && num2 >= 10) && (num1 <= 99 && num2 <= 99)) {

            int firstDigit = num1 / 10; // 12
            int secondDigit = num1 % 10; // 3
            int thirdDigit = num2 / 10; // 34
            int fourthDigit = num2 % 10; // 5

            if ((firstDigit == thirdDigit) || (firstDigit == fourthDigit)
                    || (secondDigit == thirdDigit) || (secondDigit == fourthDigit)) {
                return true;
            }
        }
        return false;
    }
}
