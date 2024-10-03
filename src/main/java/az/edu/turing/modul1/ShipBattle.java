package az.edu.turing.modul1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import java.util.*;

public class ShipBattle {

    public static int count = 1;
    public static Scanner sc = new Scanner(System.in);
    public static String[][] board = new String[5][5];
    public static Random random = new Random();

    public static void main(String[] args) {

        startGame();
        int targetRow = random.nextInt(5);
        int targetColumn = random.nextInt(5);

        playGame(targetRow, targetColumn);

        sc.close();
    }

    public static void startGame() {
        System.out.println("All set. Get ready to rumble!");
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], " - ");
        }
    }

    public static void playGame(int targetRow, int targetColumn) {
        while (true) {
            showBoard();
            int row = getUserInput("Enter the row (1-5): ");
            int column = getUserInput("Enter the column (1-5): ");

            if (board[row][column].equals(" * ")) {
                System.out.println("You already shot here. Try again.");
                continue;
            }

            if (checkHit(row, column, targetRow, targetColumn)) {
                break;
            }
            count++;
        }
    }

    public static int getUserInput(String message) {
        System.out.print(message);
        int input = sc.nextInt() - 1;
        while (input < 0 || input > 4) {
            System.out.println("Please enter a valid number between 1 and 5!");
            input = sc.nextInt() - 1;
        }
        return input;
    }


    public static void showBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean checkHit(int row, int column, int targetRow, int targetColumn) {
        if (row == targetRow && column == targetColumn) {
            System.out.println("You have won!");
            board[row][column] = " X ";
            return true;
        } else {
            System.out.println("Missed! Try again.");
            board[row][column] = " * ";
            return false;
        }
    }
}
