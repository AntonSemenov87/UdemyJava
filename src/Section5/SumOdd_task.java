package Section5;

public class SumOdd_task {
    public static void main(String[] args) {

        System.out.println(sumOdd(100, 100));

    }

    public static boolean isOdd (int number) {
        if (number < 0 && number % 2 != 0) {
            return false;
        } else {
            return true;
        }
    }
    public static int sumOdd (int start, int end) {
        if (start <= 0 || end <= 0) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
