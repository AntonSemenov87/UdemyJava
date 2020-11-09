package Cyber_practice.Mutable_vs_Immutable;

public class Convert_StringToStringBuilder {
    public static void main(String[] args) {
        String original = "Anton";
        StringBuilder sb = new StringBuilder(original);
        sb.reverse();
        String result = sb.toString();
        System.out.println(result);
    }
}
