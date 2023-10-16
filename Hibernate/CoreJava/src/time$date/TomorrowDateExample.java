package time$date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TomorrowDateExample {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Add one day to the current date to get tomorrow's date
        LocalDate tomorrowDate = currentDate.plus(1, ChronoUnit.DAYS);
        
        System.out.println("Tomorrow's Date (using java.time): " + tomorrowDate);
    }
}

