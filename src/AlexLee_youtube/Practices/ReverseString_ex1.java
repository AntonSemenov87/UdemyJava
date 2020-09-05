package AlexLee_youtube.Practices;

public class ReverseString_ex1 {
    public static void main(String[] args) {
        String str = "Anton";

        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        System.out.println(rev);
    }
}
