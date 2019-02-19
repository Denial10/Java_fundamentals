package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and usig a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to find the first vowel in the word and the word you entered!: ");
        String word = scanner.next();

        int length = word.length();
        int count = 0;

        while(count < length){
            char c = word.charAt(count);

            if (c == 'a'){
                System.out.println("The first vowel in " + word + " is " + c);
                break;
            } else if (c == 'e'){
                System.out.println("The first vowel in " + word + " is " + c);
                break;
            } else if (c == 'i'){
                System.out.println("The first vowel in " + word + " is " + c);
                break;
            } else if (c == 'o'){
                System.out.println("The first vowel in " + word + " is " + c);
                break;
            } else if (c == 'u'){
                System.out.println("The first vowel in " + word + " is " + c);
                break;

            }

            count++;
        }
    }
}