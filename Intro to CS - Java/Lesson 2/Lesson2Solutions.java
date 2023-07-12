//*******************************************************************
// Author: Monish Saravana Kumar Divya Sundari
// Course: Everyone STEM - Intro to CS: Java
// Last Modified: 7/11/2023
//
// PURPOSE:
// - Contains all the code mentioned in Lesson 2 of, Everyone STEM's Intro to CS: Java Course.
//
// ASSUMPTIONS:
// - Assumes that you have read through the associated slides for this lesson.
//*******************************************************************


// Import the Scanner class
import java.util.Scanner;
public class Lesson2Solutions {
    // ------------------------------- Activity Code  -------------------------------
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner myScanner = new Scanner(System.in);

        // Printing to the console
        System.out.println("Welcome to the Triangle Hypotenuse Calculator");
        System.out.println("---------------------------------------------");

        // Ask for length of leg 1
        System.out.println("Enter the length of the first leg: ");
        // Read user input (int)
        int legOne = myScanner.nextInt();

        // Ask for length of leg 2
        System.out.println("Enter the length of the second leg: ");
        // Read user input (int)
        int legTwo = myScanner.nextInt();

        // Close the scanner Object
        myScanner.close();

        // a^2 + b^2 = c^2 ;  so c^2 is the hypotenuse squared
        double hypotenuseSquared  = legOne*legOne + legTwo * legTwo;

        // Taking the square root of the squared value
        double hypotenuse = Math.sqrt(hypotenuseSquared);
        System.out.println("The length of the hypotenuse, for a triangle that has leg lengths: " + legOne + ", " + legTwo + " is " + hypotenuse);

    }


}
