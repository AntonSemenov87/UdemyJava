package AlexLee_youtube.someYoutubeCourse;

public class MathClass_example {
    public static void main(String[] args) {

        // round method
        float num = 3.24f;
        int result = Math.round(num);
        System.out.println(result); //3

        // max method
        int maxNum = Math.max(2343, 2321);
        System.out.println(maxNum);

        // random method
        int randomNum = (int) Math.round(Math.random() * 100);
        System.out.println(randomNum);

    }
}
