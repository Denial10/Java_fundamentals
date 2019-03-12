package arrays.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 5: More arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.println("Hi, please enter number from 1 to 10: ");
            array[i] = scanner.nextInt();
        }


        // write code here


    }
}