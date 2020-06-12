package Section4;

public class SecondsMinutes_task {
    public static void main(String[] args) {

        getDurationString(3456);

    }

    public static void getDurationString (int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            System.out.println("Invalid value");
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println(minutes + "min " + seconds + "sec = " + hours + "hr " + remainingMinutes + "m " + seconds + "s");
    }
    public static void getDurationString (int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value");
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds = " + minutes + "m " + remainingSeconds + "s");

        getDurationString(minutes, remainingSeconds);
    }
}
