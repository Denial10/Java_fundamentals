package fundamentals.labs;

import java.util.Scanner;

/**
 * Fundamentals Exercise 5: Days to seconds
 *
 *      Take in a number in days from the user between 1 and 1,000,000,000 and convert it to
 *      seconds.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("a number in days from the user between 1 and 1,000,000 : ");
        int days = scanner.nextInt();

        double seconds = days * 86400.00;


        System.out.println(days + " days is exactly " + seconds + " seconds");
        System.out.println("50 days are" + seconds);

    }

    }

