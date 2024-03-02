package taskfive;

import java.util.Random;
import java.util.Scanner;

/**
 * Plays the popular scissor-rock-paper game. The program asks the user for
 * one of the options (1 for scissor, 2 for rock or 3 for paper) and then
 * randomly
 * picks one of them for the computer and presents if you or the computer won,
 * or
 * if it was a draw. If the user enters 0 the program will end and display the
 * total score.
 */
public class GameSRP {
  private static final Random rnd = new Random();
  
  /**
   * Main.
   */
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in, "utf-8");
    int youWon = 0;
    int compWon = 0; 
    int draw = 0;
    boolean game = true;

    while (game) {
      System.out.print("Scissor (1), rock (2), paper (3) or 0 to quit: ");
      int player = scan.nextInt();

      if (player == 1 || player == 2 || player == 3 || player == 0) {
        if (player != 0) {
          int comp = rnd.nextInt(3) + 1;
          int result = player - comp;

          if (player == comp) {
            System.out.println("It's a draw!");
            draw++;
          } else if (result == -1 || result == 2) {
            System.out.println("You lost, " + "computer had " + comp);
            compWon++;
          } else {
            System.out.println("You won, " + "computer had " + comp);
            youWon++;
          }
        } else {
          System.out.println("Score: " + youWon + " (you) " + compWon + " (computer) " + draw + "(draw).");
          game = false;
        }
      } else {
        System.out.println("Please input correct number.");
      }
    }
    scan.close();
  }
}
