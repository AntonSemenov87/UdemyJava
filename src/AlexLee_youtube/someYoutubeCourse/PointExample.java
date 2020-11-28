package AlexLee_youtube.someYoutubeCourse;

import java.awt.*;

public class PointExample {
    public static void main(String[] args) {

        Point p1 = new Point(1,1);
        Point p2 = p1;
        p1.x = 2;
        p1.y = 2;

        System.out.println(p2.x);


    }
}
