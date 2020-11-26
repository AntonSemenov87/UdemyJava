package AlexLee_youtube.extras;

import java.util.Scanner;

public class Finally_keyword {
    public static void main(String[] args) {

        try {
            int a = 5 / 0;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Keep playing");
        }


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println(scan.next());
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            scan.close();
        }

    }
}
