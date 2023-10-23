public class Calculator
{
    private String name;
    
    public static double inchesToCentimeters(double in)
    {
        // System.out.println(name);
        return in * 2.54;
    }
    
    // Overloaded Methods
    // Java looks at method name, and parameter
    // data types
    // ^^^ makes up method signature
    public static int square(int x)
    {
        System.out.println("Squaring int...");
        return x * x;
    }
    
    public static double square(double x)
    {
        System.out.println("Squaring double...");
        return x * x;
    }
    
    public static void method(int x, double y)
    {
        
    }
    
    public static void method(double z, int a)
    {
        
    }
    
    public static void add5(int x)
    {
        x += 5;
    }
    
    public static void add5(Circle x)
    {
        x.setRadius(x.getRadius() + 5);
    }
}






