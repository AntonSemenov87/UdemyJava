package AlexLee_youtube.someYoutubeCourse;

import java.util.Scanner;

public class ForAndWhileLoops {
    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {
            System.out.println("Hi #" + i);
        }


        int i = 4;
        while (i > 0) {
            System.out.println("While loop");
            i--;
        }


        String input = "";

        Scanner scanner = new Scanner(System.in);
        //while (!input.equalsIgnoreCase("quit")) {
        while (true){
            System.out.println("Input:");
            input = scanner.nextLine().toLowerCase();

            if (input.equalsIgnoreCase("pass"))
                continue;

            if (input.equalsIgnoreCase("quit"))
                break;

            System.out.println(input);

        }
    }
}
