/**
 * The Area class.
 *
 * This program has three overloaded static methods 
 * for calculating the areas of the circles, 
 * rectangles, and cylinders.
 *
 * @author hunter.wilson
 * @version 10.23.2023
 */
public class Area
{
    // Circle
    public static double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // Rectangle
    public static double getArea(int width, int length) {
        return width * length;
    }

    // Cylinder
    public static double getArea(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
