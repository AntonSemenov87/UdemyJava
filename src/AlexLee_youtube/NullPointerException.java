package AlexLee_youtube;

import java.util.Scanner;

public class NullPointerException extends Throwable {
    public static void main(String[] args) {

        String a = null;
        System.out.println(a.length());

        Scanner scan = null;
        scan.nextInt();

    }
}
