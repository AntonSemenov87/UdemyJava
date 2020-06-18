package Section5;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What year were you born in?");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int birthYear = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter your name below");
            String name = scanner.nextLine();

            int age = 2020 - birthYear;

            if (age >= 0 && age <= 100) {
                System.out.println(name + " you're " + age + " years old");
            } else {
                System.out.println("Incorrect year of Birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }


        scanner.close();
    }

}
