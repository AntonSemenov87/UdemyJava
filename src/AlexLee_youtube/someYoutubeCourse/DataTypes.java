package AlexLee_youtube.someYoutubeCourse;

import java.util.Date;

public class DataTypes {
    public static void main(String[] args) {
        // 8 primitive datatypes
        byte age = 30;
        short num = 12345;
        int viewsCount1 = 123_456_789;
        long viewsCount2 = 3_123_456_789l;
        double price1 = 10.99;
        float price2 = 10.99f;
        char letter = 'A';
        boolean isEligible = true;

        Date now = new Date();
        System.out.println(now);

        int x = 1;
        int y = x;
        x = 2;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
