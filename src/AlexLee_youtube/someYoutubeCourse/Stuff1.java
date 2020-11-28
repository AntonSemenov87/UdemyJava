package AlexLee_youtube.someYoutubeCourse;

public class Stuff1 {
    public static void main(String[] args) {

        String one = " Kremenchug";

        System.out.println(one.indexOf("m")); // 3
        System.out.println(one.indexOf("w")); // -1

        one = one.concat("!");
        one = one.replace("!", " :-) ");
        System.out.println(one);
        one = one.trim();
        System.out.println(one);

    }
}
