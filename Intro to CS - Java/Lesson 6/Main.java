//*******************************************************************
// Author: Monish Saravana Kumar Divya Sundari
// Course: Everyone STEM - Intro to CS: Java
// Last Modified: 7/3/2023
//
// PURPOSE:
// - Contains all the code mentioned in Lesson 6 of, Everyone STEM's Intro to CS: Java Course.
//
// ASSUMPTIONS:
// - Assumes that you have read through the associated slides for this lesson.
//*******************************************************************
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ------------------------------- Calling a Function -------------------------------

        int x = 5;
        int y = 10;
        int additionResult = sum(x, y); // you can the result of sum in a variable, because the sum returns an integer.
        System.out.println("The sum is: " + additionResult);

        aboutMe("James", "Blue");


        // ------------------------------- Using functions from imported modules -------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();

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
