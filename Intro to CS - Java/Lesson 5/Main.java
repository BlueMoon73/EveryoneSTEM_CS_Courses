//*******************************************************************
// Author: Monish Saravana Kumar Divya Sundari
// Course: Everyone STEM - Intro to CS: Java
// Last Modified: 7/1/2023
//
// PURPOSE:
// - Contains all the code mentioned in Lesson 5 of, Everyone STEM's Intro to CS: Java Course.
//
// ASSUMPTIONS:
// - Assumes that you have read through the associated slides for this lesson.
//*******************************************************************
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // ------------------------------- Creating and Initializing Lists -------------------------------

        // Initializing with values
        int[] as = {10, 20, 30, 40, 50};

        // Declaring and initializing an empty list
        int[] myList = new int[5];
        myList[0] = 10;
        myList[1] = 20;
        myList[2] = 30;
        myList[3] = 40;
        myList[4] = 50;

        // ------------------------------- Accessing List Elements ------------------------------

        // accessing the elements in the list using their index.
        int[] someNumbers = {10, 20, 30, 40, 50};
        int firstElement = someNumbers[0];
        int thirdElement = someNumbers[2];
        System.out.println("First Element: " + firstElement);
        System.out.println("Third Element: " + thirdElement);

        // ------------------------------- Looping through Lists using a For-Loop  -------------------------------

        // looping through a list explicitly using indices.
        int[] moreNumbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < moreNumbers.length; i++) {
            System.out.println("Number at index " + i + ": " + moreNumbers[i]);
        }

        // ------------------------------- Looping through Lists using a For-Each Loop ------------------------------

        // create an array
        int[] otherNumbers = {3, 7, 5, -5};

        // iterating through the array
        // "num" is just a variable name, it can be named as anything you want.
        for (int num : otherNumbers) {
            System.out.println(num);
        }

        // create an array of Strings
        String[] someStrings = {"Hello", "Hi!", "What's Up!", "Hey!"};

        // iterating through this array
        // remember to use the correct datatype in the loop
        for (String greeting : someStrings) {
            System.out.println(greeting);
        }
        // you can use for-each loops for all the datatypes we've learned so far!


        // ------------------------------- List Operations -------------------------------

        // First of all, you can replace values in a list:
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        // Replace the first element in the array, with Toyota
        cars[0] = "Toyota";
        // Now this will print Toyota instead of Volvo.
        System.out.println(cars[0]);

        // However, you cannot add more elements than there were in the array at initialization
        // in this case there were 4 elements, so you cannot add a 5th element
        // this line of code would lead to an error: cars[4] = "Honda";

        // the length property tells you how many elements are in an array.
        System.out.println("The length of the cars array is: " + cars.length);
        // You can also store it in a variable!
        int carsLength = cars.length;
        System.out.println("The value of the variable carsLength is: " + carsLength);

        // List Operations using java.util.Arrays:
        int[] nums = {10, 20, 30, 40, 50};

        // Adding an element (creates another array with an added element)
        int[] updatedNumbers = Arrays.copyOf(nums, nums.length + 1);
        updatedNumbers[5] = 60;

        // converting the list to a string, to print it
        System.out.println(Arrays.toString(updatedNumbers));

        // Removing an element (creates another array with an removed  element)
        int[] reducedNumbers = Arrays.copyOfRange(nums, 0, nums.length - 1);

        // converting the list to a string, to print it
        System.out.println(Arrays.toString(reducedNumbers));

        // Sorting the list
        Arrays.sort(nums);

        // Searching for a value
        int index = Arrays.binarySearch(nums, 30);
        System.out.println("Index of 30: " + index);
    }
    }
