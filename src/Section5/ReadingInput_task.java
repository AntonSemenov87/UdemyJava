package Section5;

import java.util.Scanner;

public class ReadingInput_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 1;
        while (count <= 10) {
            System.out.println("Enter number #" + count);
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int num = scanner.nextInt();
                sum += num;
                count++;
            } else {
                System.out.println("Invalid Number");
                scanner.nextLine();
            }

        }
        System.out.println("Sum of your numbers is: " + sum);

        scanner.close();
    }
}
