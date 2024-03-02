package tasknine;

import java.util.Scanner;

/**
 * Print calendar given a specic year and month.
 */
public class PrintCalendar {
  /**
   * A method of converting a number input by the user to a month name.
   */
  public static String monthName(int anumber) {

    String[] m = { "January", "February", "March", "April", "May", "June", "July",
        "August", "September", "October", "November", "December" };
    return m[anumber - 1];
  }

  /**
   * If a number of a year can be divided by 4 and can't be divided by 100,
   * or it can be divided by 400, it is a leap year. Pure maths.
   */
  public static boolean isLeapYear(int year) {

    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  }

  /**
   * A method of Number of days in a specific month.
   */
  public static int daysOfMonth(int year, int month) {

    if (month == 2) {
      if (isLeapYear(year)) {
        return 29;
      } else {
        return 28;
      }
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
      return 30;
    } else {
      return 31;
    }
  }

  /**
   * A method of computing how many days in total from 01.01.1800 to the year and
   * month the user input.
   */
  public static int totalDays(int year, int month) {
    int totalDays = 0;

    // Compute the number of days from 01.01.1800 to the previous year the user
    // input.
    for (int i = 1800; i < year; i++) {
      if (isLeapYear(i)) {
        totalDays += 366;
      } else {
        totalDays += 365;
      }

      // Plus the number of the days from the start of the year user input to the
      // previous month user input.
    }
    for (int j = 1; j < month; j++) {
      totalDays += daysOfMonth(year, j);
    }

    return totalDays;
  }

  /**
   * A method return a number from which a day begins in the month the user input.
   */
  public static int spaceDayOfWeek(int totalDays) {
    int space = (totalDays + 2) % 7; // Because 1800.01.01 is Wednesay, so number of spaces in the first week is 2.
    return space;
  }

  /**
   * A method of printing calendar.
   */
  public static void printCalendar(int spaceDayOfWeek, int daysOfMonth) {
    System.out.println();
    System.out.println("----------------------------------------");
    System.out.println("Mon\tTue\tWed\tThu\tFri\tSat\tSun");

    for (int i = 0; i < spaceDayOfWeek; i++) {
      System.out.print("\t");
    }

    for (int i = 1; i <= daysOfMonth; i++) {
      if (i < 10) {
        System.out.print(" " + i + "\t");
      } else {
        System.out.print(i + "\t");
      }
      if ((i + spaceDayOfWeek) % 7 == 0) {
        System.out.println();
      }
    }
  }

  /**
   * This is the Main.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in, "utf-8");

    System.out.print("Enter a year after 1800: ");
    int year = scan.nextInt();
    System.out.print("Enter a month(1-12): ");
    int month = scan.nextInt();

    System.out.println(monthName(month) + " " + year);

    int totalDays = totalDays(year, month);
    int spaceDayOfWeek = spaceDayOfWeek(totalDays);
    int daysOfMonth = daysOfMonth(year, month);
    printCalendar(spaceDayOfWeek, daysOfMonth);
    scan.close();
  }
}
