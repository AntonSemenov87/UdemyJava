package AlexLee_youtube;

public class Strings_usage {
    public static void main(String[] args) {
        String name = "Billy Bob Joe";

        System.out.println("Name: " + name);
        System.out.println("All UPPER case: " + name.toUpperCase());
        System.out.println("First character: " + name.charAt(0));
        System.out.println("Length: " + name.length());
        System.out.println("Last character: " + name.charAt(name.length()-1));
        System.out.println("Substring: " + name.substring(10, 13));


    }
}
