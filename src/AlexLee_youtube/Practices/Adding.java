package AlexLee_youtube.Practices;

import java.util.Scanner;

public class Adding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        System.out.println("Result is " + (a + b));
    }
}
