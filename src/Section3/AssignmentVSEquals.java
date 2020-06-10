package Section3;

public class AssignmentVSEquals {
    public static void main(String[] args) {
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar != true) {
            System.out.println("This was not supposed to happen");
        }
    }
}
