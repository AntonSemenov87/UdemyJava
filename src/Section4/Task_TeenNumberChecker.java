package Section4;

public class Task_TeenNumberChecker {


    public static boolean hasTeen (int a, int b, int c) {
        if (a >= 13 && a <= 19) {
            return true;
        } else if (b >= 13 && b <= 19) {
            return true;
        } else if (c >= 13 && c <= 19) {
            return true;
        }
        return false;
    }

    public static boolean isTeen (int num) {
        if (num >= 13 && num <= 19) return true;
        return false;
    }

    // OR:
//    public static boolean hasTeen (int a, int b, int c) {
//        return (isTeen(a) || isTeen(b) || isTeen(c));
//
//    }
//
//    public static boolean isTeen(int number){
//
//        return (number >= 13 && number <= 19);
//
//    }
}
