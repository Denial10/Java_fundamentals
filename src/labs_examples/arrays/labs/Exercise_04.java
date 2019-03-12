package labs_examples.arrays.labs;

/**
 * Irregular Arrays
 * <p>
 * Create and populate an irregular array of size and contents of your choosing. Using a nested
 * "for-each" loop, iterate and print out each element of the array.
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] whatever = {
                {239, 21},
                {22, 34, 98},
                {212, 19, 32}
        };
        for (int i = 0; i < whatever.length; i++) {
            for (int j = 0; j < whatever[i].length; j++) {
                System.out.println(whatever[i][j]);

            }
        }
    }

}
