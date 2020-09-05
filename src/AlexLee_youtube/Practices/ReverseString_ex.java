package AlexLee_youtube.Practices;

public class ReverseString_ex {
    public static void main(String[] args) {

        String original = "Anton";

        char [] letters = new char[original.length()];

        int indexOfLetter = 0;
        for (int i = original.length()-1; i >= 0 ; i--) {
            letters[indexOfLetter] = original.charAt(i);
            indexOfLetter++;
        }

        String reversed = "";
        for (int i = 0; i < letters.length; i++) {
            reversed += letters[i];
        }

        System.out.println(reversed);

    }
}
