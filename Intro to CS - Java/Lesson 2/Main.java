//*******************************************************************
// Author: Monish Saravana Kumar Divya Sundari
// Course: Everyone STEM - Intro to CS: Java
// Last Modified: 7/1/2023
//
// PURPOSE:
// - Contains all the code mentioned in Lesson 2 of, Everyone STEM's Intro to CS: Java Course.
//
// ASSUMPTIONS:
// - Assumes that you have read through the associated slides for this lesson. 
//*******************************************************************

public class Main {
    public static void main(String[] args) {

        // ------------------------------- Declaring and Initializing Variables  -------------------------------

        // Declare an integer variable named "age" and assign a value
        int age = 25;

        // Declare a double variable named "weight" and assign a value
        double weight = 65.5;

        // Declare a char variable named "grade" and assign a value
        char grade = 'A';

        // Declare a boolean variable named "isStudent" and assign a value
        boolean isStudent = true;



        // ------------------------------- Working with Variables  -------------------------------

        // Declare and initialize variables of primitive data types
                int myNumber = 42;
                double pi = 3.14159;
                char letter = 'A';
                boolean isTrue = true;

        // Printing the values of the variables
                System.out.println("My number: " + myNumber);
                System.out.println("Pi: " + pi);
                System.out.println("Letter: " + letter);
                System.out.println("Is true? " + isTrue);

        // Numerical Operations with Variables
                int num1 = 32;
                int num2 = 33;
                int num3 = num1 + num2;
                System.out.println(num3);

        // Reassigning variables
        num1 = 20;
        num2 = 40;
        num3 = 60;

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Number 3: " + num3);


        // ------------------------------- Working with Strings -------------------------------


        // Declare a String variable named "name" and assign a value
        String name = "John Doe";

        // Concatenating strings
                String greeting = "Hello, " + name + "!";

        // Finding the length of a string
                int length = name.length();

        // Converting to uppercase
                String uppercaseName = name.toUpperCase();

        // Printing the values of the variables
                System.out.println("Greeting: " + greeting);
                System.out.println("Length of name: " + length);
                System.out.println("Uppercase name: " + uppercaseName);



        // ------------------------------- Working with Constants -------------------------------
        // Declare constant variables for conversion rates
        // These variables now cannot be changed.
        final double USD_TO_EUR = 0.85;
        final double USD_TO_GBP = 0.72;
        final double USD_TO_JPY = 109.53;

        // Declare a variable for the amount in USD
                double amountInUSD = 100.00;

        // Convert the amount to different currencies
                double amountInEUR = amountInUSD * USD_TO_EUR;
                double amountInGBP = amountInUSD * USD_TO_GBP;
                double amountInJPY = amountInUSD * USD_TO_JPY;

        // Display the converted amounts
                System.out.println("Amount in USD: $" + amountInUSD);
                System.out.println("Amount in EUR: €" + amountInEUR);
                System.out.println("Amount in GBP: £" + amountInGBP);
                System.out.println("Amount in JPY: ¥" + amountInJPY);

                }
        }
