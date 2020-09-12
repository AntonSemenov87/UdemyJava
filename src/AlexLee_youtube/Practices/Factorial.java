package AlexLee_youtube.Practices;

public class Factorial {
    public static void main(String[] args) {

        // Factorial is a number multiplied by each of it's preceeding numbers
        // 5! = 5 * 4 * 3* 2 * 1 = 120        (5! --> means factorial)
        System.out.println(factorial(5));


    }

    public static int factorial (int n) {


        if (n == 1) {
            System.out.println("factorial(" + n + ") = 1");
            return 1;
        } else {
            System.out.println("factorial(" + n + ") = " + n + " * factorial(" + (n - 1) + ")");
            return n * factorial(n - 1);
        }

    }

}
