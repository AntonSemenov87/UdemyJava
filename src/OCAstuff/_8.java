package OCAstuff;

import java.time.LocalDate;
import java.time.Period;

public class _8 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 7, 30);
        date = date.plusDays(3);
        date = date.minusYears(10);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
        Period p = Period.of(1,2,3);
        date = date.minus(p);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }
}
