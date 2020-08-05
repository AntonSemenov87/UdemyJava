package RandomStuff;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class CurrentTime {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate);

//        LocalDate localDate = LocalDate.of(1987, 06, 04);
//        System.out.println("LocalDate: " + localDate);

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(currentDate));

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat.format(currentDate));

        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
        System.out.println(dayOfWeekFormat.format(currentDate));

        SimpleDateFormat clockFromat = new SimpleDateFormat("h:mm a");
        System.out.println(clockFromat.format(currentDate));
    }
}
