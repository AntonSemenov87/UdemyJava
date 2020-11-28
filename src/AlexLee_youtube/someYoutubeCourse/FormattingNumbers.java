package AlexLee_youtube.someYoutubeCourse;

import Cyber_practice.ObjectsClasses.Car;

import java.text.NumberFormat;
import java.util.Random;

public class FormattingNumbers {
    public static void main(String[] args) {

        // $1,234,567

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String perCent = percent.format(0.1);
        System.out.println(perCent);

        // OR
        System.out.println(NumberFormat.getPercentInstance().format(0.2));
    }
}
