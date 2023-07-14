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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ------------------------------- Calling a Function -------------------------------

        int x = 5;
        int y = 10;
        int additionResult = sum(x, y); // you can the result of sum in a variable, because the sum returns an integer.
        System.out.println("The sum is: " + additionResult);


        // Calling the aboutMe function, with "James" and "Blue" as parameters.
        // Try playing around with the parameters and see how the output changes.
        aboutMe("James", "Blue");

        // ------------------------------- Exception Handling with Try-Catch -------------------------------

        try {
            // creates an integer array with 3 elements
            int[] myNumbers = {1, 2, 3};

            // tries to access index 10 of the array, which does not exist
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            // since an exception is encountered, the following code is run
            System.out.println("Something went wrong.");
        }


        // ------------------------------- Try-Catch-Finally -------------------------------

        try { // contains the code that may throw an exception
            int[] moreNums = {3, 4, 5};
            System.out.println(moreNums[8]);
        } catch (Exception e) { // the code to handle an exception if one is thrown
            System.out.println("Something went wrong.");
        } finally { // code that executes regardless of whether an exception is thrown
            System.out.println("The 'try catch' is finished.");
        }

        // ------------------------------- Reading from  a file  -------------------------------

        try {
            // Creating a file object
            File file = new File("data.txt");

            // Opening the file for reading
            Scanner scanner = new Scanner(file);

            // Reading the file line by line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Closing the file
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        // ------------------------------- Writing to a file  -------------------------------
        try {
            // Creating a file object
            File file = new File("output.txt");

            // Opening the file for writing
            FileWriter writer = new FileWriter(file);

            // Writing data to the file
            writer.write("Hello, World!");
            writer.write("\nThis is a sample line.");

            // Closing the file
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }


    }

    // ------------------------------- Creating a Function -------------------------------
    // sum is the name of the function, and integers a and b are the parameters.
    // the first 'int' before sum, is the return type.
    static int sum(int a, int b) {
        int result = a + b;
        return result; // this is the return statement. since the return type is an int, result must be a int.
    }

    // this function has a void return type as it does not return anything, it just prints the 2 parameters
    static void printStrings(String string1, String string2) {
        System.out.println(string1 + string2);
    }

    // this function has a String return type and has 2 String parameters.
    static void aboutMe(String name, String favColor) {
        String nameString = "My name is " + name + ".";
        String colorString = "My favorite color is " + favColor + ".";

        // Calling the other function
        printStrings(nameString, colorString);
    }

}
