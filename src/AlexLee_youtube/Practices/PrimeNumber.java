package AlexLee_youtube.Practices;

import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(findPrimes(1, 1000000000));

    }

    public static ArrayList<Integer> findPrimes (int start, int end) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int n = start; n < end; n++) {
            boolean prime = true;

            int i = 2;
            while (i <= n/2){
                if (n % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }
            if (prime) {
                primes.add(n);
            }
        }



        return primes;
    }
}
