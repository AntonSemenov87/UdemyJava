package Section4;

public class Task_LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
    }

    public static boolean isLeapYear (int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0 && (year % 100 == 0 || year % 400 == 0)) {
            return true;
        }
        return false;
    }
}