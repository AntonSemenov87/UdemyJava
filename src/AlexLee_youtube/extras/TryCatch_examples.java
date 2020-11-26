package AlexLee_youtube.extras;

import java.util.Scanner;

public class TryCatch_examples {
    public static void main(String[] args) {

        // 1
        try {
            int[] a = {4, 5, 1};
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println("Exception happened");
        }

        // 2
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your fav number?");

        try {
            int n = scan.nextInt();
            System.out.println(n);
        } catch (Exception e){
            System.out.println("You didn't enter a number!");
        }
    }
}
