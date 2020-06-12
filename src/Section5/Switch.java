package Section5;

public class Switch {
    public static void main(String[] args) {
        int switchValue = 5;

        switch (switchValue) {
            case 1:
                System.out.println("It is one");
                break;
            case 2:
                System.out.println("It is two");
                break;
            case 3: case 4: case 5:
                System.out.println("It is three, or four, or five");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("It's not one or two, but something else");
                break;
        }
    }
}
