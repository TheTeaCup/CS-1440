// [access specifier] class [ClassName]
public class Rectangle 
{
    // Members (fields and methods)
    // Fields
    private double length;
    private double width; 
    // private String name;     initalized to null     
    
    // Java provides default no-arg constructor
    // No-arg constructors initialize fields to 0
    // performs initialization 
    // constructors are automatically called by java
    //      when an object is created
    
    
    // Methods
    public double getLength()
    {
        return length;
    }
    
    public void setLength(double l)
    {
        length = l;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public void setWidth(double w)
    {
        width = w;
    }
    
    public double getArea()
    {
        return length * width;
    }
    
    public void set(double l, double w)
    {
        length = l;
        width = w;
        l = 0;
    }
}