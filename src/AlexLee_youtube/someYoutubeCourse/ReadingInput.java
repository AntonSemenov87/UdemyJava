package AlexLee_youtube.someYoutubeCourse;

import java.util.Scanner;

public class ReadingInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);

        System.out.print("Name: ");
        String name = scanner.next(); // Anton Semenov
        System.out.println("You are " + name); // Anton

        scanner.nextLine();

        System.out.print("Country: ");
        String country = scanner.nextLine().trim();
        System.out.println("You are from " + country);


    }
}
