
/**
 * House.
 * @author Hunter_Wilson
 * @version 09.26.2023
 */
public class House
{
    private Square wall;
    private Triangle roof;
    private Square window;

    /**
     * Imports Square as wall.
     * Triangle as roof.
     */
    public House()
    {
        wall = new Square();
        wall.makeVisible();
        wall.changeSize(100);
        wall.moveHorizontal(40);
        wall.moveVertical(150);

        roof = new Triangle();
        roof.makeVisible();
        roof.changeSize(50, 125);
        roof.moveHorizontal(100);
        roof.moveVertical(135);
        roof.changeColor("black");

        window = new Square();
        window.makeVisible();
        window.moveVertical(175);
        window.moveHorizontal(45);
        window.changeColor("blue");

    }

    /**
     * changeRoofColor.
     * Change the color of the roof
     * @param c is the color
     */
    public void changeRoofColor(String c)
    {
        roof.changeColor(c);
    }

    /**
     * changeWallColor.
     * Change the color of the wall
     * @param c is the color
     */
    public void changeWallColor(String c)
    {
        wall.changeColor(c);
    }

    /**
     * changeWindowColor.
     * Change the color of the window
     * @param c is the color
     */
    public void changeWindowColor(String c)
    {
        window.changeColor(c);
    }

    /**
     * moveHorizontal.
     * Change the position of the house horizontally
     * @param h is the integer to move by
     */
    public void moveHorizontal(int h)
    {
        wall.moveHorizontal(h);
        roof.moveHorizontal(h);
        window.moveHorizontal(h);
    }

    /**
     * moveVertical.
     * Change the position of the house vertically
     * @param v is the integer to move by
     */
    public void moveVertical(int v)
    {
        wall.moveVertical(v);
        roof.moveVertical(v);
        window.moveVertical(v);
    }

    /**
     * makeInvisible.
     * Make the whole house Invisible
     */
    public void makeInvisible()
    {
        wall.makeInvisible();
        roof.makeInvisible();
        window.makeInvisible();
    }

    /**
     * makeVisible.
     * Make the whole house Visible
     */
    public void makeVisible()
    {
        wall.makeVisible();
        roof.makeVisible();
        window.makeVisible();
    }

    /**
     * Main method.
     * @param args get args
     */
    public static void main(String[] args)
    {
        House house = new House();
    }
}
