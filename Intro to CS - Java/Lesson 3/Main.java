//*******************************************************************
// Author: Monish Saravana Kumar Divya Sundari
// Course: Everyone STEM - Intro to CS: Java
// Last Modified: 7/1/2023
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

        // ------------------------------- Nested If Statements ------------------------------

        int num = 25;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("The number is positive and even.");
            } else {
                System.out.println("The number is positive and odd.");
            }
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

    }}
