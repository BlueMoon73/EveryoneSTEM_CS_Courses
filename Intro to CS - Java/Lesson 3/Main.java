//*******************************************************************
// Author: Monish Saravana Kumar Divya Sundari
// Course: Everyone STEM - Intro to CS: Java
// Last Modified: 7/12/2023
//
// PURPOSE:
// - Contains all the code mentioned in Lesson 3 of, Everyone STEM's Intro to CS: Java Course.
//
// ASSUMPTIONS:
// - Assumes that you have read through the associated slides for this lesson.
//*******************************************************************

public class Main {
    public static void main(String[] args) {

        // ------------------------------- If Statements ------------------------------

        int age = 16;
        // if the variable age is greater than or equal to 18, run the following code.
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        }

        // ------------------------------- If-Else Statements ------------------------------

        int number = 10;
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // ------------------------------- Else-If Statements ------------------------------
        int myAge = 15;
        if (myAge >=18 ) {
            // First condition checks if myAge is >= 18.
            System.out.println("You are an adult!");
        } else if (myAge >= 13) {
            // If myAge >= 18 was false, it checks if myAge >= 18.
            System.out.println("You are a teenager, but not an adult!");
        } else if (myAge >= 5 ) {
            // If myAge >= 13 was false, it checks if myAge >= 5.
            System.out.println("You older than a toddler, but not a teen!");
        } else {
            // If all above conditions were false, then the following code executes
            System.out.println("You are a toddler or infant!!");
        }


        // ------------------------------- Nested If Statements ------------------------------

        int num = 25;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("The number is positive and even.");
            } else {
                System.out.println("The number is positive and odd.");
            }
        } else if (num < 0 && num % 2 == 0) {
            System.out.println("The number is negative and even.");
        } else if (num < 0 && num % 2 == 1) {
            System.out.println("The number is negative and odd.");
        }
        else {
            System.out.println("The number is zero.");
        }

        // ------------------------------- Switch Statements ------------------------------
        int myNum = 2;

        // creates a switch statement that is equal to
        switch (myNum){

        case 1:
            //Code to be run if myNum is equal to 1
            System.out.println("The number is 1");
            break;

        case 2:
            //Code to be run if myNum is equal to 2
            System.out.println("The number is 2");
            break;

        case 3:
            //Code to be run if myNum is equal to 3
            System.out.println("The number is 3");
            break;

        default:
            //Code to be run if myNum isn't equal to 1, 2 or 3
            System.out.println("The number isn't 1, 2, or 3!");

        }

        // The switch statement from before, can be represented using if statements like this:

        if (myNum == 1) {
            System.out.println("The number is 1");
        } else if (myNum == 2) {
            System.out.println("The number is 2");
        } else if (myNum == 3) {
            System.out.println("The number is 3");
        }
        else {
            System.out.println("The number isn't 1, 2, or 3!");
        }

    }}
