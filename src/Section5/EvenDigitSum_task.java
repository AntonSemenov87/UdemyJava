package Section5;

public class EvenDigitSum_task {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(12345678));
    }
    public static int getEvenDigitSum (int number) {
        if (number >= 0) {
            int sum = 0;
            while (number > 0) {
                int num = number % 10;
                if (num % 2 == 0) {
                    sum += num;
                }
                number = number / 10;
            }
            return sum;
        }
        return -1;
    }
}
