//*******************************************************************
// Author: Monish Saravana Kumar Divya Sundari
// Course: Everyone STEM - Intro to CS: Java
// Last Modified: 7/12/2023
//
// PURPOSE:
// - Contains all the code mentioned in Lesson 4 of, Everyone STEM's Intro to CS: Java Course.
//
// ASSUMPTIONS:
// - Assumes that you have read through the associated slides for this lesson.
//*******************************************************************

import java.util.Scanner;

public class Lesson4Solutions1 {
    public static void main(String[] args) {

        // ------------------------------- Activity 1 ------------------------------

        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        boolean choice;

        System.out.println("Welcome to the Interactive Calculator"); // Welcome message
        System.out.println("-------------------------------------");

        do {
            System.out.print("Enter the first number: "); // Prompt for the first number
            double num1 = scanner.nextDouble(); // Read the first number from the user

            System.out.print("Enter the second number: "); // Prompt for the second number
            double num2 = scanner.nextDouble(); // Read the second number from the user

            System.out.println("Select an operation:"); // Prompt for the operation choice
            System.out.println("1. Addition"); // Option 1: Addition
            System.out.println("2. Subtraction"); // Option 2: Subtraction
            System.out.println("3. Multiplication"); // Option 3: Multiplication
            System.out.println("4. Division"); // Option 4: Division

            System.out.print("Enter your choice (1-4): "); // Prompt for the operation choice
            int operation = scanner.nextInt(); // Read the user's choice of operation

            double result = 0.0; // Variable to store the result of the calculation

            switch (operation) { // Perform the selected operation based on the user's choice
                case 1: // Addition
                    result = num1 + num2;
                    break;
                case 2: // Subtraction
                    result = num1 - num2;
                    break;
                case 3: // Multiplication
                    result = num1 * num2;
                    break;
                case 4: // Division
                    result = num1 / num2;
                    break;
                default: // Invalid choice
                    System.out.println("Invalid choice!");
            }

            System.out.println("Result: " + result); // Display the result of the calculation

            System.out.print("Do you want to perform another calculation? (True/False): "); // Prompt for continuing
            choice = scanner.nextBoolean(); // Read the user's choice to continue or exit

        } while (choice); // Continue the loop if the user wants to perform another calculation (when choice is true)

        System.out.println("-----------------------------------");
        System.out.println("Thank you for using the calculator!"); // Display a farewell message
        scanner.close(); // Close the Scanner object






    }
}