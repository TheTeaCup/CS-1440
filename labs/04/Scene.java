
/**
 * Scene class.
 * @author Hunter.Wilson
 * @version 09.26.2023
 */
public class Scene
{
    private House house1;
    private House house2;
    private Circle sun;
    private Circle moon;

    /**
     * Scene method.
     */
    public Scene()
    {
        house1 = new House();
        house1.makeVisible();
        house1.changeRoofColor("green");
        house1.moveHorizontal(-75);
        house1.moveVertical(-10);

        house2 = new House();
        house2.makeVisible();
        house2.changeWallColor("blue");
        house2.changeWindowColor("yellow");
        house2.moveHorizontal(70);
        house2.moveVertical(-30);

        sun = new Circle();
        sun.setColor("yellow");
        sun.makeVisible();
        sun.moveVertical(-40);
        sun.changeSize(50);

        moon = new Circle();
        moon.setColor("blue");
        moon.makeVisible();
        moon.changeSize(50);
        moon.moveVertical(-40);
        moon.moveHorizontal(-80);

    }

    /**
     * Scene animate method.
     */
    public void animate()
    {
        sun.slowMoveHorizontal(300);
        moon.slowMoveHorizontal(275);
        return;
    }

    /**
     * main method.
     * @param args none
     */
    public static void main(String[] args)
    {
        Scene scene = new Scene();
        scene.animate();
    }
}
