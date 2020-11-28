package AlexLee_youtube.someYoutubeCourse;

public class WrapperClass_example {
    public static void main(String[] args) {

        String age = "1987";

        int realAge = Integer.parseInt(age);
        System.out.println(realAge);

        String l = "12";
        int y = Integer.parseInt(l) + 12;
        System.out.println(y);


        String phoneNumber = "7739692111";
        long num = Long.parseLong(phoneNumber);
        num += 1;
        System.out.println(num);

        String temp = "34.5";

        double tempD = Double.parseDouble(temp);
        System.out.println(tempD);

        String number = "1324";

        Integer k = Integer.valueOf(number);
        System.out.println(k);

        // valueOf() returns an Integer object while Integer. parseInt() returns a primitive int.
        // Both String and integer can be passed a parameter to Integer. valueOf() whereas only a String can be passed as parameter to Integer

    }
}
