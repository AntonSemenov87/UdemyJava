package AlexLee_youtube.extras;

enum Levels {
        LOW, MEDIUM, HIGH;
}

public class Enum_ex1 {


    public static void main(String[] args) {

        Levels l = Levels.HIGH;

        System.out.println(l);

        switch (l) {
            case LOW:
                System.out.println("Low level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
        }

    }
}
