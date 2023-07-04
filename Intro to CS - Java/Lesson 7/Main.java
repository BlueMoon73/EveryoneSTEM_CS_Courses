//*******************************************************************
// Author: Monish Saravana Kumar Divya Sundari
// Course: Everyone STEM - Intro to CS: Java
// Last Modified: 7/4/2023
//
// PURPOSE:
// - Contains all the code mentioned in Lesson 7 of, Everyone STEM's Intro to CS: Java Course.
//
// ASSUMPTIONS:
// - Assumes that you have read through the associated slides for this lesson.
//*******************************************************************
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        // ------------------------------- Reading from a file  -------------------------------

        /* the following code is enclosed by a 'try catch'
         this is required for using this method of reading files.
         basically, the code in the try section attempts to run, but if there is an error,  it will go to the
         catch section, which catches the fileNotFoundException, and prints "File not Found". It's a way to ensure the program
         doesn't crash if the specified file is not found.
         */

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
}
