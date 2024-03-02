package tasktwo;

import java.util.Random;
import java.util.Scanner;

/**
 * Compete with the computer to roll dice game.
 */
public class Nine {
  /**
   * Main method.
   */
  public static void main(String[] args) {
    Random rnd = new Random();
    Scanner scan = new Scanner(System.in, "utf-8");

    int totalYourRoll = 0;
    int totalCmtRoll = 0;

    System.out.println("Play a game:");
    System.out.println("==============");
    System.out.print("Ready to play? (Y/N) ");
    String yn = scan.nextLine();

    if (yn.equals("Y")) {
      int yourRoll1 = rnd.nextInt(6) + 1;
      System.out.println("You rolled " + yourRoll1);
      System.out.print("Would you like to roll again?(Y/N) ");

      String yn2 = scan.nextLine();

      if (yn2.equals("Y")) {

        int yourRoll2 = rnd.nextInt(6) + 1;
        totalYourRoll = yourRoll1 + yourRoll2;
        System.out.println("You rolled " + yourRoll2 + " and in total you have " + (totalYourRoll));

        if (totalYourRoll > 9) {
          System.out.println("You are been declared fat and lose the game");
          System.exit(0);
        }

        int cmtRoll1 = rnd.nextInt(6) + 1;
        System.out.println("Computer rolled " + cmtRoll1 + ".");
        if (cmtRoll1 <= 4) {
          int cmtRoll2 = rnd.nextInt(6) + 1;
          totalCmtRoll = cmtRoll1 + cmtRoll2;
          System.out.println("The computer rolled again and gets " + cmtRoll2
              + " and in toal " + totalCmtRoll);
          if (totalCmtRoll > 9) {
            System.out.println("The computer is declared fat and lose the game");
            System.exit(0);
          }
        } else {
          totalCmtRoll = cmtRoll1;
          System.out.println("The computer rolled " + totalCmtRoll);
        }
      } else if (yn2.equals("N")) {
        totalYourRoll = yourRoll1;
        // The total value of computer rolls.
        int cmtRoll1 = rnd.nextInt(6) + 1;
        System.out.println("The computer rolled " + cmtRoll1);
        if (cmtRoll1 <= 4) {
          int cmtRoll2 = rnd.nextInt(6) + 1;
          totalCmtRoll = cmtRoll1 + cmtRoll2;
          System.out.println("The computer rolled again and gets " + cmtRoll2
              + " and in toal " + totalCmtRoll);
          if (totalCmtRoll > 9) {
            System.out.println("The computer is declared fat and lose the game");
            System.exit(0);
          }
        } else {
          totalCmtRoll = cmtRoll1;
        }
      } else {
        System.exit(0);
      }

      // Compare the value.
      if (totalCmtRoll > totalYourRoll) {
        System.out.println("You lose");
      } else if (totalCmtRoll < totalYourRoll) {
        System.out.println("You win");
      } else if (totalYourRoll == totalCmtRoll) {
        System.out.println("You and the computer rolled the same.");
      }
    } else {
      System.exit(0);
    }
    scan.close();
  }
}
