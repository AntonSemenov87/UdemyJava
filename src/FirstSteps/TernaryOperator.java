package FirstSteps;

public class TernaryOperator {
    public static void main(String[] args) {

        boolean isCar = false;

        if (!isCar) {
            System.out.println("This was not supposed to happen");
        }


        isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true");
        }

        int ageOfClient = 20;
        boolean is18OrOver = ageOfClient == 20 ? true : false;
        System.out.println(is18OrOver);

        int ageChecked = 18;
        boolean isUnder21 = ageChecked <21 ? true : false;
        System.out.println(isUnder21);

    }
}
