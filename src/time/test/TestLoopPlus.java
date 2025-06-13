package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = startDate.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println("날짜 " + (i + 1) + ": " + nextDate);
        }


/*        LocalDate[] days = new LocalDate[5];
        for (int i = 0; i < days.length; i++) {
            if (i == 0) {
                days[0] = LocalDate.of(2024, 1, 1);
            } else {
                days[i] = days[i - 1].plusDays(14);
            }
            System.out.println("날짜 " + (i + 1) + ": " + days[i]);
        }*/


    }
}
