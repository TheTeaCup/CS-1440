public class Demo
{
    public static void main(String[] args)
    {
        Countable c1 = new Countable();
        System.out.println("Instance: "
            + c1.getInstanceCount());
        c1 = new Countable();
        System.out.println("Instance: "
            + c1.getInstanceCount());
        c1 = new Countable();
        System.out.println("Instance: "
            + c1.getInstanceCount());
            
        double in = 10;
        double cm = Calculator.inchesToCentimeters(in);
        System.out.printf("%.2f in = %.2f cm\n", in, cm);
        
        // Math is a utility class, and has lots of
        // static methods we can use
        Math.pow(2, 4);
        Math.log(10);
        
        int i = Calculator.square(5);
        double db = Calculator.square(8.0);
        System.out.println(i);
        System.out.println(db);
        
        Circle one = new Circle();
        Circle two = new Circle(5);
        System.out.println("one: " + one.getRadius());
        System.out.println("two: " + two.getRadius());
        
        // Passing objects as arguments
        System.out.println("concentric: " + one.isConcentric(two));
        
        int y = 2;
        Calculator.add5(y);
        System.out.println("y: " + y);
        Calculator.add5(two);
        System.out.println("two: " + two.getRadius());
    }
}




