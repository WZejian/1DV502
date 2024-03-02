package taskseven;

import java.util.Random;

/**
 * Count steps after an Ant visited a whole chessboard with 64 cells.
 */
public class Ants {
  private static final Random rnd = new Random();

  /** 
   * This is the main.
   */
  public static void main(String[] args) {
    int count = 1; // Simulation count
    int sumSteps = 0;
    double aveSteps = 0; // average steps per simulation
    while (count < 11) {

      int[][] board = new int[8][8]; // 8*8 cells in the board
      for (int x = 0; x < 8; x++) {
        for (int y = 0; y < 8; y++) {
          board[x][y] = 0; // "0"--not visited, "1"--visited. All cells are not visited at the beginning.
        }
      }

      int steps = 0;
      int visitedCells = 0;

      // randomly put the ant on a cell      
      int x = rnd.nextInt(8);
      int y = rnd.nextInt(8);
      board[x][y] = 1;
      visitedCells++;

      while (visitedCells != 64) {
        int n = rnd.nextInt(4) + 1; // ant randomly move towards one of the 4 directions

        if (n == 1) { // move west
          steps++;
          x--;
          if (x < 0) { // not cross the board, step not be counted if try "crossing" the board
            x++;
            steps--;
          }
        } else if (n == 2) { // move east
          steps++;
          x++;
          if (x >= 8) { // not cross the board, step not be counted if try "crossing" the board
            x--;
            steps--;
          }
        } else if (n == 3) { // move south
          steps++;
          y--;
          if (y < 0) { // not cross the board, step not be counted if try "crossing" the board
            y++;
            steps--;
          }
        } else if (n == 4) { // move north
          steps++;
          y++;
          if (y >= 8) { // not cross the board, step not be counted if try "crossing" the board
            y--;
            steps--;
          }
        }
        if (board[x][y] == 0) { // change the cell with "0"(not visited) to "1"(visited).
          board[x][y] = 1;
          visitedCells++;
        }
      }
      System.out.println("Number of Steps in this simulation " + count + ": " + steps);
      sumSteps += steps;
      count++;
      aveSteps = sumSteps / 10.0;
    }
    System.out.println("Average amount of steps: " + aveSteps);
  }
}