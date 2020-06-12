package Section4;

public class MinutesToYearsAndDaysCalculator_task {
    private static final String INVALID_MINUTES_VALUE = "Invalid Value";

    public static void printYearsAndDays (long minutes) {
            if (minutes >= 0) {
                int year = (int) minutes / 525600;
                int remainingMinutes = (int) minutes % 525600;
                int days = remainingMinutes / 1440;
                System.out.println(minutes + " min = " + year + " y and " + days + " d");
            } else {
                System.out.println(INVALID_MINUTES_VALUE);
            }
    }
}
