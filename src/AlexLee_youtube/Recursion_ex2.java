package AlexLee_youtube;

public class Recursion_ex2 {
    public static void main(String[] args) {

        countBackwards(6);

    }

    public static void countBackwards (int n) {
        if (n == 0) {
            System.out.println("Done!");
        } else {
            System.out.println(n);
            n--;
            countBackwards(n);
        }
    }
}
