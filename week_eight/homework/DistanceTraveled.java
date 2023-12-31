/**
 * The DistanceTraveled class.
 * 
 * This class stores the speed of a vehicle (in miles per hour) 
 * and the number of hours it has traveled. It should have a 
 * method named getDistance that returns the distance, in miles, 
 * that the vehicle has traveled .
 *
 * @author hunter.wilson 
 * @version 10.22.2023
 */
public class DistanceTraveled
{
    private int speed;
    private int hours;

    public DistanceTraveled()
    {

    }

    public void setSpeed(int s)
    {
        speed = s;
    }

    public void setHours(int h)
    {
        hours = h;
    }

    public int getSpeed()
    {
        return speed;
    }

    /**
     * The getHours method returns the number
     * of hours traveled by the vehicle.
     */

    public int getHours()
    {
        return hours;
    }

    public int getDistance()
    {
        return (int) speed * hours;
    }
}
