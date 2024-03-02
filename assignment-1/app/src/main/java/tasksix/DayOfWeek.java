package tasksix;

import java.util.Scanner;

/**
 * The "h" is the day of week where 0 is Saturday, 1 is Sunday and so on.
 * The "q" is the day of the month.
 * The "m" is the month from 1-12, January and February are counted as months 13
 * and 14 for the previous year.
 * The "j" is year\100.
 * The "k" is the year of the century (year % 100).
 * All divison are integer divison.
 */
public class DayOfWeek {
  /**
   * Main method.
   */
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in, "utf-8");

    System.out.print("Enter year: ");
    int year = scan.nextInt();

    int j = year / 100;
    int k = year % 100;

    System.out.print("Enter month (1-12): ");
    int m = scan.nextInt(); // m is month

    // January and February are counted as months 13 and 14 for the previous year
    if (m == 1 || m == 2) {
      m = m + 12;
      j = (year - 1) / 100;
      k = (year - 1) % 100;
    }

    System.out.print("Enter day of the month (1-31): ");
    int q = scan.nextInt();
    int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

    String[] dayOfWeek = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
    System.out.println("Day of week is " + dayOfWeek[h]);

    scan.close();
  }
}
