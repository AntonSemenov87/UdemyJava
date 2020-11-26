package AlexLee_youtube.someYoutubeCourse;

public class Hello {
    public static void main(String[] args) {
        // print
        System.out.println("Hello World");

        // variables
        int num = 5;
        double doubley = 4.6;
        char firstInitial = 'K';
        String name = "kathryn";
        boolean isHome = true;
        int hour = 14;

        System.out.println(num);
        System.out.println(doubley);
        System.out.println(firstInitial);
        System.out.println(isHome);
        System.out.println(name);

        if (name.equalsIgnoreCase("kathryn")) {
            System.out.println("Happy BDay");
        } else {
            System.out.println("Have a nice day");
        }

        if(num < 18) {
            System.out.println("Not an adult");
        }

        if (isHome && hour < 20) {
            System.out.println("You're sitting at home and it's not even 8pm! Go outside");
        } else {
            System.out.println("Is it time to go home yet?");
        }

    }
}
