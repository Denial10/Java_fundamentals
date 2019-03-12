package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value of 1,2,3,4,5 : ");
        int number = scanner.nextInt();


        switch(number){

            case 1 :
                System.out.println(" x equals to 1");
                break;
            case 2:
                System.out.println(" x equals to 2");
                break;
            case 3:
                System.out.println("x equals to 3");
                break;
            case 4:
                System.out.println("x equals to 4");
                break;
            case 5:
                System.out.println("x equals to 5");
                break;
            default:
                System.out.println("cannot resolve X");
        }

        }
    }

