//*******************************************************************
// Author: Monish Saravana Kumar Divya Sundari
// Course: Everyone STEM - Intro to CS: Java
// Last Modified: 7/4/2023
//
// PURPOSE:
// - Contains all the code mentioned in Lesson 8 of, Everyone STEM's Intro to CS: Java Course.
//
// ASSUMPTIONS:
// - Assumes that you have read through the associated slides for this lesson.
//*******************************************************************

public class Main {
    public static void main(String[] args) {
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



    }
}
