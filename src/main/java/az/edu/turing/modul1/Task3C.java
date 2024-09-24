package az.edu.turing.modul1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3C {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String[][] board = new String[5][5];
        Random random = new Random();

        int targetRow = random.nextInt(5);
        int targetColumn = random.nextInt(5);

        System.out.println("All set. Get ready to rumble!");
        int count = 0;

        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], " - ");

        }

        while (true) {

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }

            System.out.print("Enter the row (1-5): ");
            int row = sc.nextInt() - 1;
            while (row < 0 || row > 4) {
                System.out.println("Please enter a valid row between 1 and 5!");
                row = sc.nextInt() - 1;
            }

            System.out.print("Enter the column (1-5): ");
            int column = sc.nextInt() - 1;
            while (column < 0 || column > 4) {
                System.out.println("Please enter a valid column between 1 and 5!");
                column = sc.nextInt() - 1;
            }

            if (board[row][column].equals(" * ")) {
                System.out.println("You already shot here. Try again.");
                continue;
            }

            if (row == targetRow && column == targetColumn) {
                System.out.println("You have won!");
                board[row][column] = " X ";
                break; //
            } else {
                System.out.println("Missed! Try again.");
                board[row][column] = " * ";
            }
            count++;
        }
        for (String[] strings : board) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }

        System.out.println("You has been won " + count + " times!");


        sc.close();
    }
}