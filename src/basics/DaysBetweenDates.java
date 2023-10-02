package basics;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetweenDates {
	public static void main(String[] args) {
        // Define two date strings
        String dateStr1 = "2023-08-01";
        String dateStr2 = "2023-08-31";

        // Parse the date strings into LocalDate objects
        LocalDate date1 = LocalDate.parse(dateStr1);
        LocalDate date2 = LocalDate.parse(dateStr2);

        // Calculate the days between the two dates
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);

        System.out.println(daysBetween);
    }
}
