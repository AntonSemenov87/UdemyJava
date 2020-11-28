package AlexLee_youtube.someYoutubeCourse;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // if num is divisible by 5 --> FIZZ
        // if num is divisible by 10 --> FIZZ
        // if num is divisible by 3 --> BUZZ
        // if num is divisible by 5 and 3 --> FIZZBUZZ
        // else --> print same number entered

        Scanner scanner = new Scanner(System.in);
        String answer = "";
        do {
            System.out.print("Please enter any number: ");
            int num = scanner.nextInt();

            if (num % 5 == 0 && num % 3 == 0)
                System.out.println("Fizz Buzz");
            else if (num % 5 == 0)
                System.out.println("Fizz");
            else if (num % 3 == 0)
                System.out.println("Buzz");
            else
                System.out.println(num);

            System.out.println("Do you want to play again? y/n");
            scanner.nextLine();
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("y"));



    }
}
