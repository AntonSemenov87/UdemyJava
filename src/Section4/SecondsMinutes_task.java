package Section4;

public class SecondsMinutes_task {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));

    }

    public static String getDurationString (int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
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
        return minutes + "m " + seconds + "s = " + hourString + " " + minutesString + " " + secondsString;
    }
    public static String getDurationString (int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        //System.out.println(seconds + " seconds = " + minutes + "m " + remainingSeconds + "s");

        return getDurationString(minutes, remainingSeconds);
    }
}
