
/**
 * Short, one-line description of ISP class here.
 *
 * @author hunter wilson
 * @version 10.24.2023
 */
public class ISP
{
    private char pkg;
    private double hoursUsed;

    public ISP()
    {
        pkg = 'A';
        hoursUsed = 0.0;
    }

    public ISP(char pg, double hourU)
    {
        pkg = pg;
        hoursUsed = hourU;
    }

    public char getPkg()
    {
        return pkg;
    }

    public double getHoursUsed()
    {
        return hoursUsed;
    }

    public void setPkg(char pk)
    {
        pkg = pk;
    }

    public void setHoursUsed(double hoursU)
    {
        hoursUsed = hoursU;
    }

    public double calculateCharges()
    {
        double totalCharges = 0.0;

        switch (pkg)
        {
            case 'A':
                if (hoursUsed <= 10)
                {
                    totalCharges = 9.95;
                }
                else
                {
                    totalCharges = 9.95 + 2 * 
                    (Math.ceil(hoursUsed) - 10);
                }
                break;
            case 'B':
                if (hoursUsed <= 20)
                {
                    totalCharges = 14.95;
                }
                else
                {
                    totalCharges = 14.95 + 1 *
                    (Math.ceil(hoursUsed) - 20);
                }
                break;
            case 'C':
                totalCharges = 19.95;
                break;
        }
        return totalCharges;
    }
    
    public void printSavings()
    {
        double currentCharge = calculateCharges();
        double packageB;
        double packageC = 19.95;
        
        if (hoursUsed > 20)
        {
            packageB = 14.95 + (Math.ceil(hoursUsed) - 20);
        }
        else 
        {
            packageB = 14.95;
        }
        
        if (pkg == 'A')
        {
           if (packageB < currentCharge)
           {
               System.out.printf("You would have saved $%.2f by choosing package B. \n", currentCharge - packageB);
           }
           
           if (packageC < currentCharge)
           {
               System.out.printf("You would have saved $%.2f by choosing package C. \n", currentCharge - packageC);
           }
        }
        else if (pkg == 'B')
        {
            if (packageC < currentCharge)
            {
                System.out.printf("You would have saved $%.2f by choosing package C. \n", currentCharge - packageC);
            }
        }
    }
}
