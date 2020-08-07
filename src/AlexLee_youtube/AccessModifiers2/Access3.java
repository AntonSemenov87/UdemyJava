package AlexLee_youtube.AccessModifiers2;

import AlexLee_youtube.AccessModifiers1.Access1;

public class Access3 extends Access1 {
    public static void main(String[] args) {

        Access3 a = new Access3();
        System.out.println(a.hours);
        System.out.println(a.minutes);

        a.getHours();

    }
}
