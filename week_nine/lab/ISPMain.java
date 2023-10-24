import java.util.Scanner;

/**
 * Short, one-line description of ISPMain class here.
 * 
 * @author hunter wilson
 * @version 10.24.2023
 */
public class ISPMain
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        char packageChoice;
        double hoursUsed = 0.0;

        System.out.println("\n[A] Package A");
        System.out.println("[B] Package B");
        System.out.println("[C] Package C");
        System.out.print("Please select your package: ");
        packageChoice = Character.toUpperCase(kb.nextLine().charAt(0));

        if (packageChoice == 'A' || packageChoice == 'B')
        {
            System.out.print("Please enter your hours used: ");
            hoursUsed = kb.nextDouble();
        }

        ISP isp = new ISP(packageChoice, hoursUsed);

        System.out.println(isp.calculateCharges());
        isp.printSavings();
    }
}
