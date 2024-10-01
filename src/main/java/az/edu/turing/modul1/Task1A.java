package az.edu.turing.modul1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----------LET THE GAME BEGIN---------------\n");


        Random random = new Random();
        int randomNumber = random.nextInt(101);
        //  int randomNumber = (int) (Math.random() * 100);


        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.println("Enter the number you want to,between 0 and 100");
        int number = sc.nextInt();
        sc.nextLine();

        int[] numbers = new int[100];
        int count = 0;
        count++;


        while (randomNumber != number) {

            if (number < 0 || number > 100) {
                System.out.println("Invalid Input!");
                number = sc.nextInt();
            } else if (number > randomNumber) {
                System.out.println("Your entered number is small,please ,try again!");
                number = sc.nextInt();
            } else {
                System.out.println("Your entered number is large,please ,try again");
                number = sc.nextInt();
            }
            numbers[count] = number;
            count++;



        }
        int[] finalArrays = Arrays.copyOf(numbers, count);
        Arrays.sort(finalArrays);

        System.out.println("\nCongrats " + name.toUpperCase() + "! You have won the game after " + count + " times!\n");
        System.out.println("the numbers you entered: " + Arrays.toString(finalArrays));

        sc.close();


    }
}