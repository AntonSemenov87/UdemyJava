package Section4;

public class SecondsMinutes_task {
    public static void main(String[] args) {

        getDurationString(123);

    }

    public static void getDurationString (int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            System.out.println("Invalid value");
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        // fixing 01 --> adding ZERO if hour, min or seconds is less than 10
        String hourString = hours + "h";
        if (hours < 10) {
            hourString = "0" + hourString;
        }
        String minutesString = minutes + "m";
        if (minutes < 10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        // Printing result:
        System.out.println(minutes + "m " + seconds + "s = " + hourString + " " + minutesString + " " + secondsString);
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
