package Section4;

public class Task_EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,3));
    }

    public static boolean hasEqualSum (int a, int b, int c) {
        if (a + b == c) {
            return true;
        }
        return false;
    }

}
