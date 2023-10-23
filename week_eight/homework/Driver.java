import java.util.Scanner;

/**
 * The Driver class.
 * 
 * This class demostrates the DistanceTraveled class.
 * 
 * @author hunter.wilson 
 * @version 10.22.2023
 */
public class Driver
{
    /**
     * Main method.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter the speed: ");
        int speed = kb.nextInt();

        while (speed < 1)
        {
            System.out.println("Cannot enter negative speed.");

            System.out.println("Please enter the speed: ");
            speed = kb.nextInt();
        }

        System.out.println("Please enter the time in hours: ");
        int hours = kb.nextInt();

        while (hours < 1)
        {
            System.out.println("Cannot enter less than one hour.");

            System.out.println("Please enter the time in hours: ");
            hours = kb.nextInt();
        }

        System.out.println("Hour    Distance Traveled");        
        int time = 1;
        while (time <= hours)
        {
            DistanceTraveled d = new DistanceTraveled();

            d.setHours(time);
            d.setSpeed(speed);

            //System.out.println(time + "\t\t" + d.getDistance());
            System.out.printf("%-8d%-8d\n", time, d.getDistance());
            time++;
        }

    }
}
