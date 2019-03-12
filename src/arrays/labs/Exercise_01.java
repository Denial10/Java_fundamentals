package arrays.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 4: Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Hi, please enter number" + (i + 1) + " of 10: ");
            nums[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int j = 0; j < nums.length; j++){
            sum += nums[j];
        }
        System.out.println("the sum is " + sum);
        int average = 0;
        average = sum / 10;
        System.out.println("The average is " + average);
    }
}





