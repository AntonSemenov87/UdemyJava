package Mutable_vs_Immutable;

public class Task_removeExistingWord {
    public static void main(String[] args) {
        System.out.println(deleteWord("this has concan in the middde"));
    }

    public static String deleteWord(String word) {
        StringBuilder sb = new StringBuilder(word);

        int index = sb.indexOf("con");

        if (index != -1) {
            sb.delete(index, index + "con".length());
        }
        return sb.toString();
    }
}
