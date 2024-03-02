package taskthree;

import java.util.Scanner;

/**
 * Calculate the minimum number of days you need to work to earn a specific amount of money.
 */
public class DangerousWork {
  /**
   * Main method.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in, "utf-8");
    
    System.out.print("How much would you like to earn: ");
    long money = scan.nextLong();           
    int n = 1;

    // Formular: money = 0.01 * (2**n).
    while (Math.pow(2, n) < money / 0.01) {
      n += 1;
    }

    if (n <= 30) {
      System.out.println("You will have your money in " + n + " days.");
    } else {
      System.out.println("You may not survive.");
    }
    scan.close();
  }      
}
