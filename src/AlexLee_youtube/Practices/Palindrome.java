package AlexLee_youtube.Practices;

import jdk.swing.interop.SwingInterOpUtils;

public class Palindrome {
    public static void main(String[] args) {

        String original = "race car";
        original = original.replace(" ", "");

        String reversed = "";
        for (int i = original.length()-1; i >= 0; i--) {
            reversed += original.charAt(i);
            System.out.println(reversed);
        }

        boolean palindrome = true;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != reversed.charAt(i)){
                palindrome = false;
            }
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("NOT a palindrome");
        }

    }
}
