package RandomStuff;

public class ReturnStatement {
    public static void main(String[] args) {

        printMessage();

        int sum = add(5, 4);
        System.out.println(sum);


    }

    public static void printMessage () {
        System.out.println("This is out first method");
    }

    public static int add (int a, int b) {
        return a + b;
    }



}
