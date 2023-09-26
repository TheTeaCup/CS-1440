
/**
 * ShapeFun.
 * @author Hunter_Wilson
 * @version 09.26.2023
 */
public class ShapeFun
{
    /**
     * Imports Square, Circle, and Triangle.
     * @param args get args
     */
    public static void main(String[] args)
    {
        Square square = new Square();
        square.makeVisible();
        square.changeColor("green");
        square.moveHorizontal(50);
        square.moveVertical(10);
        square.changeSize(10);

        Circle circle = new Circle();
        circle.makeVisible();

        Triangle triangle = new Triangle();
        triangle.makeVisible();

    }
}
