package Section4;

public class Task_BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 25));
    }
    public static boolean shouldWakeUp (boolean isBarking, int hourOfDay) {
       if (hourOfDay < 0 || hourOfDay > 23) {
           return false;
       } else if (isBarking && hourOfDay < 8 || hourOfDay > 22) {
           return true;
       }
       return false;
    }
}
