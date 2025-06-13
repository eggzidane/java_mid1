package time.test;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        // 코드 작성
        LocalDate dt = LocalDate.of(year, month, 1);

        DayOfWeek firstDayOfWeek = dt.getDayOfWeek();
        DayOfWeek lastDayOfWeek = dt.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);



    }
}
