public class Circle {
    
    public double radius;
    // no-arg constructor
    /*
    public Circle ()
    {
        radius = 0;
    }
    */
   
    public Circle(double r)
    {
        radius = r;
    }
    
    public void setRadius(double r)
    {
        radius = r;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
}