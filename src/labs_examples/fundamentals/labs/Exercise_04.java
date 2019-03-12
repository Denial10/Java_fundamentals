package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {
        double radius;
        double height;
        double volume;
        double surface;

        radius = 3.14;
        height = 5;

        volume = 3.14 * radius * radius * height;
        surface = (2 * 3.142 * radius * radius) + (2 *3.142 * radius *height);

        System.out.println("volume is " + volume);
        System.out.println("the surface of the cylinder is " + surface);

    }
}
