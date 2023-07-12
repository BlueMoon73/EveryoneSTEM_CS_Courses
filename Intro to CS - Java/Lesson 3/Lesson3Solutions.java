//*******************************************************************
// Author: Monish Saravana Kumar Divya Sundari
// Course: Everyone STEM - Intro to CS: Java
// Last Modified: 7/11/2023
//
// PURPOSE:
// - Contains all the code mentioned in Lesson 3 of, Everyone STEM's Intro to CS: Java Course.
//
// ASSUMPTIONS:
// - Assumes that you have read through the associated slides for this lesson.
//*******************************************************************


// Import the Scanner class
import java.util.Scanner;
public class Lesson3Solutions {
    // ------------------------------- Activity Code  -------------------------------
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in); // Create a Scanner object to read user input

        // Printing to the console
        System.out.println("Welcome to the 4-Function Calculator!");
        System.out.println("-------------------------------------");

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble(); // Read the first number from the user

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble(); // Read the second number from the user

        System.out.println("Select an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt(); // Read the operation choice from the user



        double result = 0.0;

        // Perform the selected operation based on the user's choice
        switch (choice) {
            case 1:
                result = num1 + num2; // Addition
                break;
            case 2:
                result = num1 - num2; // Subtraction
                break;
            case 3:
                result = num1 * num2; // Multiplication
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2; // Division
                } else {
                    System.out.println("Error: Cannot divide by zero!"); // Division by zero error
                    return; // Terminate the program
                }
                break;
            default:
                System.out.println("Invalid choice!"); // Invalid choice error
                return; // Terminate the program
        }

        System.out.println("The result is: " + result);

        input.close(); // Close the Scanner object
    }


}
