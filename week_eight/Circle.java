public class Circle
{
    private double radius;
    
    public Circle()
    {
        radius = 0;
    }
    
    public Circle(double r)
    {
        radius = r;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public boolean isConcentric(Circle c)
    {
        return radius < c.getRadius();
    }
    
    public void setRadius(double x)
    {
        radius = x;
    }
}



