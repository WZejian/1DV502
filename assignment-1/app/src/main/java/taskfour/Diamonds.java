package taskfour;

import java.util.Scanner;

/**
 * Create an diamond of stars by having the user input a positive number, 
 * which corresponds to the height till the middle of the diamond.
 */
public class Diamonds {
  /**
   * This is the Main.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in, "utf-8");
    int n = 1;
    while (n >= 0) {
      System.out.print("Give a positive number: ");
      n = scan.nextInt();
      int space = n;

      if (n > 0) {
        // Print the upper part of the diamond.
        for (int i = 1; i <= n; i++) {
          // print each line with spaces and *.
          for (int j = 1; j < space; j++) {
            System.out.print(" ");
          }
          space -= 1;
          for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
          }
          System.out.println();
        }
        space = 1;

        // Print the lower part of the diamond.
        for (int i = 1; i <= n - 1; i++) {
          // Print each line with spaces and *.
          for (int j = 1; j <= space; j++) {
            System.out.print(" ");
          }
          space += 1;
          for (int j = 1; j <= 2 * (n - i) - 1; j++) {
            System.out.print("*");
          }
          System.out.println();
        }
      } else {
        System.out.println("Please input a positive integer.");
      }
    }
    scan.close();
  }
}
