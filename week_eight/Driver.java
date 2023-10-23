import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        // get data from user
        // create DataPoint object
        // ask if they want to enter more data
        // if "y", continue getting data
        Scanner kb = new Scanner(System.in);
        String input = "";
        do
        {
            // create DataPoint
            DataPoint d = DataPoint.createDataPoint();
            System.out.println(d);
            
            System.out.print("Continue? ");
            input = kb.nextLine();
        }
        while (input.equals("y"));
    }
}






