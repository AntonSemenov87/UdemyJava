package RandomStuff;

public class Methods {
    public static void main(String[] args) {
        welcome();
        multiply(5, 10);
        multiply(3, 8);
        divide(10, 2);
        divide(324, 1);

    }
    public static void multiply (int a, int b) {
        System.out.println(a * b);
    }

    public static void welcome(){
        System.out.println("Welcome to simple calculator!");
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }
}
