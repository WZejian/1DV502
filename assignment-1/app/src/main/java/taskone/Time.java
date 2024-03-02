package taskone;

import java.util.Scanner;

/**
 * Convert a number of seconds to hours and minutes and seconds.
 */
public class Time {
  /**
   * Main method.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in, "utf-8");
    System.out.print("Enter a positive number: ");
    int number = scan.nextInt();

    int hours = number / (60 * 60);
    int minutes = (number % (60 * 60)) / 60;
    int seconds = (number % (60 * 60)) % 60;

    System.out.println("This corresponds to " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
    scan.close();
  }
}