// import java.util.Scanner;   // explicit import
import java.util.*; // implicit import
import hello.World;

public class Driver
{
    public static void main(String[] args)
    {
        Circle2 c = new Circle2();    // radius = 0
        c.setRadius(5);
        System.out.println("Field Radius: " + c.getRadius());
        
        String s = "hello";
        Scanner kb = new Scanner(System.in);
        
        ArrayList<String> al = new ArrayList();
        
        World w = new World();
        System.out.println(w.sampleMethod(10));
    }
}
