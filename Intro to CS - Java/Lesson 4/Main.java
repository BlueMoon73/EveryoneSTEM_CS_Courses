public class Main {
    public static void main(String[] args){

        int count = 0;
        while (count < 5) {

            // WHILE count is less than 5, the value of count increases by one, and it gets printed.
            System.out.println("Count: " + count);
            count++;
        }


        int num = 1;
        // the code underneath will be run once, THEN the condition will be checked.
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num > 6);
        // since num is not greater than 6, it only runs once.


        // for-loops - explained
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            // code runs 5 times, as var i starts at 0, and increases by 1, as long as it is less than 5.
        }

        // for-loops practice problem, try to guess what'll happen without running it.
        for (int x = 0; x <= 10; x = x + 2) {
            System.out.println(x);
        }




        /*        You can also place a loop inside another loop. It's  called a nested loop.
           The "inner loop" gets  executed once for each iteration of the "outer loop":
        */

        // Outer loop
        for (int i = 1; i <= 4; i++) {
            System.out.println("Outer Loop: " + i); // Executes 4 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 12 times (4 * 3)
            }
        }

    }}
