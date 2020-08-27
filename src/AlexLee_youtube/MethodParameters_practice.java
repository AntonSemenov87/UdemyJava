package AlexLee_youtube;

public class MethodParameters_practice {
    public static void main(String[] args) {

        sayHiToUser("Anton");
        System.out.println(add(4, 5));

    }

    public static void sayHiToUser (String name) {
        System.out.println("hello, " + name);
    }

    public static int add (int x, int y) {
        return x + y;
    }
}
