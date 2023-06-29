public class Main {
    public static void main(String[] args) {


        int age = 16;
        // if the variable age is greater than or equal to 18, run the following code.
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        }


        int number = 10;
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }


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
