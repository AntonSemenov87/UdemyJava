package Section4;

public class Task_decimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.123, 3.124));
    }

    public static boolean areEqualByThreeDecimalPlaces (double one, double two) {
        one *= 1000;
        two *= 1000;
        int a = (int)one;
        int b = (int)two;
        if (a == b) {
            return true;
        }
        return false;
    }

}
