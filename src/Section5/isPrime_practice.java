package Section5;

public class isPrime_practice {
    public static void main(String[] args) {

        int countOfPrimes = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a Prime number");
                countOfPrimes++;
//                if (countOfPrimes == 10) {
//                    break;
//                }
            }
        }
        System.out.println(countOfPrimes);

    }
    public static boolean isPrime (int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
