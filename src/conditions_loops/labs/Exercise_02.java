package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner
        Scanner  scanner = new Scanner(System.in);
        // 2) prompt user
        System.out.print("Enter a number between 1 and 7 to determine what day of the week it is: ");
        // 3) assign input to variable as int
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Today is Monday! ");
        } else if (number == 2){
            System.out.println("Today is Tuesday! ");
        } else if (number == 3) {
            System.out.println("Today is Wednesday!");
        } else if (number == 4){
            System.out.println("Today is Thursday! ");
        } else if (number == 5){
            System.out.println("Today is Friday!");
        } else if (number == 6){
            System.out.println("Today is Saturday!");
        } else if (number == 7){
            System.out.println("Today is Sunday! ");
        }

        // 4) write completed code here


    }
}
