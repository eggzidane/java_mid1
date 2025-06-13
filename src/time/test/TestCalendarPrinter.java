package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalendar(year, month);

        /*System.out.println("Su Mo Tu We Th Fr Sa");
        LocalDate firstDate = LocalDate.of(year, month, 1);
        for (int i = 0; i < firstDate.lengthOfMonth(); i++) {
            if (firstDate.plusDays(i).getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println();
            }
            System.out.print(firstDate.plusDays(i).getDayOfMonth()+ " ");
        }*/
    }

    private static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        //월요일 = 1 (1 % 7 = 1) ... 일요일 = 7 (7 % 7 = 0)
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }
        for (int i = 0; i < firstDayOfMonth.lengthOfMonth(); i++) {
            System.out.printf("%2d ", firstDayOfMonth.getDayOfMonth());

            if (firstDayOfMonth.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            firstDayOfMonth = firstDayOfMonth.plusDays(1);
        }

      /*  while (firstDayOfMonth.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ", firstDayOfMonth.getDayOfMonth());
            if (firstDayOfMonth.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            firstDayOfMonth = firstDayOfMonth.plusDays(1);
        }*/
    }
}
