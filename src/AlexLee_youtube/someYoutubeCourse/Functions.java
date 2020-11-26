package AlexLee_youtube.someYoutubeCourse;

public class Functions {

    public static int doubley (int x) {
        return x * x;
    }

    public static void main(String[] args) {
        int doubled = doubley(5);
        int anotherDoubled = doubley(10);
        System.out.println(doubled);
        System.out.println(anotherDoubled);

        String name = "Anton";
        char lastCharacter = name.charAt(name.length() - 1);
        System.out.println(lastCharacter);
        boolean isEmpty = name.isEmpty();
        System.out.println(isEmpty);
    }
}
