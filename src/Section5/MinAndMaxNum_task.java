package Section5;

import java.util.Scanner;

public class MinAndMaxNum_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number:");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }

            scanner.nextLine(); // handle input
        }
        System.out.println("Min = " + min + ", max = " + max);


        scanner.close();
    }
}
