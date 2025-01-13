import java.util.Scanner;

public class TicTacToe {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("\nLet's play tic tac toe");

    // Task 1: Create an array with three rows of '_' characters.
    char[][] board = { { '-', '-', '-' }, { '-', '-', '-' }, { '-', '-', '-' } };
    // Task 2: Call the function printBoard();
    printBoard(board);

    /*
     * { Task 3: Loop through turns.
     * 
     * if (X) turn {
     * Task 4: call askUser().
     * Task 5: populate the board using askUser's return value.
     * } else {
     * Task 4: call askUser().
     * Task 5: populate the board using askUser's return value. Then, print it.
     * 
     * }
     * 
     * Task 6 - Call the function.
     * if return value == 3 {
     * print: X wins and break the loop
     * } else if return value == -3 {
     * print: O wins and break the loop
     * }
     * 
     * }
     */
    int[] spot;
    for (int i = 0; i < 9; i++) {
      System.out.print("Turn: ");
      if (i % 2 == 0) {
        System.out.println("X");
        spot = askUser(board);
        board[spot[0]][spot[1]] = 'X';
      } else {
        System.out.println("O");
        spot = askUser(board);
        board[spot[0]][spot[1]] = 'O';
      }
      printBoard(board);
      int count = checkWin(board);
      if (count == 3) {
        System.out.println("X wins");
        break;
      } else if (count == -3) {
        System.out.println("O wins");
        break;
      }
    }

    scan.close();
  }

  /**
   * Task 2 - Write a function that prints the board.
   * Function name - printBoard()
   * 
   * @param board (char[][])
   * 
   *              Inside the function:
   *              1. print a new line.
   *              2. print the board.
   *              • separate each row by two lines.
   *              • each row precedes a tab of space
   *              • each character in the grid has one space from the other
   *              character
   */

  public static void printBoard(char[][] board) {
    System.out.println();
    for (int i = 0; i < board.length; i++) {
      System.out.print("\t");
      for (int j = 0; j < board[0].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println("\n");
    }
  }

  /**
   * Task 4 - Write a function that lets the user choose a spot
   * Function name – askUser
   * 
   * @param board (char[][] board)
   * @return spot (int[])
   * 
   *         Inside the function
   *         1. Asks the user: - pick a row and column number:
   *         2. Check if the spot is taken. If so, let the user choose again.
   *         3. Return the row and column in an int[] array.
   * 
   */
  public static int[] askUser(char[][] board) {
    System.out.print(" - pick a row and column number: ");
    int row = scan.nextInt();
    int col = scan.nextInt();
    while (board[row][col] != '-') {
      System.out.print("Spot taken, try again: ");
      row = scan.nextInt();
      col = scan.nextInt();
    }
    return new int[] { row, col };
  }

  /**
   * Task 6 - Write a function that determines the winner
   * Function name - checkWin
   * 
   * @param board (char[][])
   * @return count (int)
   * 
   *         Inside the function:
   *         1. Make a count variable that starts at 0.
   *         2. Check every row for a straight X or straight O (Task 7).
   *         3. Check every column for a straight X or straight O (Task 8).
   *         4. Check the left diagonal for a straight X or straight O (Task 9).
   *         5. Check the right diagonal for a straight X or straight O (Task 10).
   */
  public static int checkWin(char[][] board) {
    int rows = checkRows(board);
    if (Math.abs(rows) == 3)
      return rows;

    int columns = checkColumns(board);
    if (Math.abs(columns) == 3)
      return columns;

    int leftDiagonal = checkLeft(board);
    if (Math.abs(leftDiagonal) == 3)
      return leftDiagonal;

    int rightDiagonal = checkRight(board);
    if (Math.abs(rightDiagonal) == 3)
      return rightDiagonal;

    return 0;
  }

  public static int checkRows(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      int count = 0;
      for (char c : board[i]) {
        if (c == 'X')
          count++;
        else if (c == 'O')
          count--;
      }
      if (Math.abs(count) == 3)
        return count;
    }
    return 0;
  }

  public static int checkColumns(char[][] board) {
    for (int i = 0; i < board[0].length; i++) {
      int count = 0;
      for (int j = 0; j < board.length; j++) {
        if (board[j][i] == 'X')
          count++;
        else if (board[j][i] == 'O')
          count--;
      }
      if (Math.abs(count) == 3)
        return count;
    }
    return 0;
  }

  public static int checkLeft(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
      if (board[i][i] == 'X')
        count++;
      else if (board[i][i] == 'O')
        count--;
    }
    return count;
  }

  public static int checkRight(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
      if (board[i][2 - i] == 'X')
        count++;
      else if (board[i][2 - i] == 'O')
        count--;
    }
    return count;
  }
}
