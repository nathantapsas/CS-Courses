package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String numbers = ""; // To be able to display the inputs so far

        String input;

        int number, sum = 0, count = 0;
        double average = 0;

        // Prompt the user for the first integer
        System.out.println("Enter an integer or type \"stop\" to quit.");
        input = scan.nextLine().trim();

        // Program will run until the user enters "stop"
        while(!input.equalsIgnoreCase("stop")) {

            // Attempt to parse an integer value from the users input
            try {
                number = Integer.parseInt(input);
                numbers += number + ", ";
                sum += number;
                count++;

                average = (double)sum / count;

            } catch (NumberFormatException e) {
                System.out.println("\"" + input + "\" is not a valid integer!");
            }

            // Prints the running average and prompts the user for the next integer
            System.out.printf("The average of: \n%s\nis: %.2f\n", numbers, average);
            System.out.println("\nEnter an integer or type \"stop\" to quit.");
            input = scan.nextLine();

        }
        System.out.println("Exiting program, goodbye!");

    }
}
