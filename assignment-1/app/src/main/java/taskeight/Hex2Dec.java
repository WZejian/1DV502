package taskeight;

import java.util.Scanner;

/**
 * Enter a hexadecimal number and Convert it to a decimal number.
 */
public class Hex2Dec {
  /**
   * Create a method called hexToDecimal.
   */
  public static long hexToDecimal(String hex) {
    hex = hex.toUpperCase();
    char[] h = hex.toCharArray();

    int length = h.length;
    long deci = 0;

    for (int i = 0; i < length; i++) {
      if (h[i] >= 'A') { // If h[i] ='A', 'B', 'C', 'D', 'E', 'F'
        deci += (h[i] - 'A' + 10) * Math.pow(16, length - 1 - i);
      } else {
        deci += (h[i] - '0') * Math.pow(16, length - 1 - i);
      }
    }
    return deci;
  }

  /**
   * Main.
   */
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in, "utf-8");
    System.out.print("Enter a hex number: ");
    String ahexNumber = scan.nextLine();

    long deci = hexToDecimal(ahexNumber);
    System.out.println("The decimal value for " + ahexNumber + " is: " + deci);
    scan.close();
  }
}
