package AlexLee_youtube.Practices;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1987, 6, 4);
        int years = Period.between(birthday, today).getYears();

        System.out.println(today);
        System.out.println(birthday);
        System.out.println(years);
    }
}
