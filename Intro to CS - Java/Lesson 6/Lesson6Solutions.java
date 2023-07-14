//*******************************************************************
// Author: Monish Saravana Kumar Divya Sundari
// Course: Everyone STEM - Intro to CS: Java
// Last Modified: 7/14/2023
//
// PURPOSE:
// - Contains all the code mentioned in Lesson 6 of, Everyone STEM's Intro to CS: Java Course.
//
// ASSUMPTIONS:
// - Assumes that you have read through the associated slides for this lesson.
//*******************************************************************

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lesson6Solutions {
    public static void main(String[] args) {

        try {
            // Create a FileWriter object to write to the file
            FileWriter fileWriter = new FileWriter("shopping_list.txt", true);

            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            System.out.println("=== Shopping List Program ===");

            boolean exitProgram = false;

            // While the user wants to add items, keep looping the code.
            while (!exitProgram) {
                System.out.print("Enter an item: ");
                String item = scanner.nextLine();

                System.out.print("Enter the quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                // Format the item and quantity as a line to write to the file
                String line = item + " - " + quantity;

                // Write the line to the file
                fileWriter.write(line + "\n");

                System.out.println("Item added to the shopping list.");

                System.out.print("Do you want to add another item? (true/false): ");

                // Check if the user wants to exit the program
                exitProgram = !scanner.nextBoolean();
                scanner.nextLine(); // Consume the newline character so the input doesn't get messed up.
            }

            // Close the FileWriter to save changes to the file
            fileWriter.close();

            System.out.println("Shopping list saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the shopping list.");
        }
    }
}