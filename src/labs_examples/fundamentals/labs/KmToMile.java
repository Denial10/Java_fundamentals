package labs_examples.fundamentals.labs;

import java.util.Scanner;

public class KmToMile {
    public static void main(String[] args) {
        /*
        take in a number of km from the user and print out how many miles that is.
         */

        //take in number of km from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter a number of km from 1 to 1,000,000 : ");
        int km = scanner.nextInt();
        //convert km to miles.
        double miles;
        miles = km * 0.62137;
        //print out number of miles.
        System.out.println(km + " km is " + miles + " miles ");
    }
}
