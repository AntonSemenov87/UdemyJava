package AlexLee_youtube.extras;

public class Enum_ex2 {

    enum Flavor {
        CHOCOLATE, VANILLA, STRAWBERRY;
    }

    public static void main(String[] args) {

        Flavor flav = Flavor.VANILLA;

        if (flav == Flavor.VANILLA) {
            System.out.println("It's vanilla");
        } else if (flav == Flavor.CHOCOLATE) {
            System.out.println("It's chocolate");
        } else if (flav == Flavor.STRAWBERRY){
            System.out.println("it's strawberry");
        }
    }
}
