package AlexLee_youtube.someYoutubeCourse;

import java.text.NumberFormat;

public class NumsFormat {
    public static void main(String[] args) {

        String number1 = "312";

        int num1 = Integer.parseInt(number1);
        num1++;
        System.out.println(num1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(312.24));

        String number2 = "435";
        Integer a = Integer.valueOf(number2);
        System.out.println(a);

        double percentage = 0.25;
        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println(percent.format(percentage));

    }
}
