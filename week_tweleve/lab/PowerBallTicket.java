import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * PowerBallTicket class.
 * 
 * @author Hunter Wilson.
 * @version 11.14.2023.
 */
public class PowerBallTicket
{
    /**
     * main method for PowerBallTicket Class.
     * returns a file with powerball numbers.
     * 
     * @param args from user
     * @throws IOException for files
     */
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a file name: ");
        String fileName = scan.nextLine();

        System.out.println("How many powerball tickets would you like? ");
        int amountOfTickets = scan.nextInt();

        PowerBall pb = new PowerBall();

        FileWriter fw = new FileWriter(new File(fileName));

        int i = 0;
        String output = "";
        
        while (i < amountOfTickets) 
        {
            pb.generateLotteryPicks();
            output += pb.toString() + "\n";
            i++;
        }

        fw.write(output);
        fw.close();
    }
}
