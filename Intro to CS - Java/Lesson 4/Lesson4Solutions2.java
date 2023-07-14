//*******************************************************************
// Author: Monish Saravana Kumar Divya Sundari
// Course: Everyone STEM - Intro to CS: Java
// Last Modified: 7/14/2023
//
// PURPOSE:
// - Contains all the code mentioned in Lesson 4 of, Everyone STEM's Intro to CS: Java Course.
//
// ASSUMPTIONS:
// - Assumes that you have read through the associated slides for this lesson.
//*******************************************************************

import java.util.Scanner;

public class Lesson4Solutions2 {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int numTerms = scanner.nextInt();

        // Initialize the first two terms of the series
        int firstTerm = 0;
        int secondTerm = 1;

        // Print the first two terms of the series
        System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);

        // Generate and print the remaining terms of the series using a for loop
        for (int i = 2; i < numTerms; i++) {
            // Calculate the next term in the series by summing the previous two terms
            int nextTerm = firstTerm + secondTerm;

            // Print the next term
            System.out.print(", " + nextTerm);

            // Update the firstTerm and secondTerm variables for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        // Close the Scanner object
        scanner.close();

    }
}