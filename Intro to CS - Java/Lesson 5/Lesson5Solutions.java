//*******************************************************************
// Author: Monish Saravana Kumar Divya Sundari
// Course: Everyone STEM - Intro to CS: Java
// Last Modified: 7/14/2023
//
// PURPOSE:
// - Contains all the code mentioned in Lesson 5 of, Everyone STEM's Intro to CS: Java Course.
//
// ASSUMPTIONS:
// - Assumes that you have read through the associated slides for this lesson.
//*******************************************************************

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson5Solutions {
    public static void main(String[] args) {

        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

// Create ArrayLists to store student names and grades
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> studentGrades = new ArrayList<>();

        // Boolean to track if user is done entering students
        boolean doneEntering = false;
        while (!doneEntering) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            // If the user enters 'done', exit the loop
            if (name.equals("done")) {
                break;
            }

            // Add the student name to the studentNames ArrayList
            studentNames.add(name);

            System.out.print("Enter grade for " + name + ": ");
            // Cast the int -> double (implicit)
            double grade = scanner.nextInt();


            // Add the grade to the studentGrades ArrayList
            studentGrades.add(grade);

            System.out.print("Are you done entering students? (true/false): ");
            doneEntering = scanner.nextBoolean();
        }

// Display the grade report
        System.out.println("\nGrade Report:");
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i) + ": " + studentGrades.get(i));
        }

// Calculate the overall class average
        double sum = 0.0;
        for (double grade : studentGrades) {
            sum += grade;
        }
        double classAverage = sum / studentGrades.size();
        System.out.println("\nClass Average: " + classAverage);
    }
}