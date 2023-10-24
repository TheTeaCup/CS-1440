
/**
 * Short, one-line description of RabbitPopulation class here.
 * 
 * @author hunter wilson
 * @version 10.24.2023
 */
public class RabbitPopulation
{
    private int initialPopulation;
    private int sixMonthPopulation;

    // sensible values
    public RabbitPopulation()
    {
        initialPopulation = 0;
        sixMonthPopulation = 0;
    }

    // constructor for both values
    public RabbitPopulation(int ip, int smp)
    {
        if (ip < 1)
        {
            initialPopulation = 0;
        } 
        else
        {
            initialPopulation = ip;
        }

        if (smp < 1)
        {
            sixMonthPopulation = 0;
        }
        else
        {
            sixMonthPopulation = smp;  
        }
    }

    // accessor
    public int getInitialPopulation()
    {
        return initialPopulation;
    }

    public int getSixMonthPopulation()
    {
        return sixMonthPopulation;
    }

    // mutator
    public void setInitialPopulation(int ip)
    {
        if (ip < 1)
        {
            initialPopulation = 0; 
        } 
        else
        {
            initialPopulation = ip; 
        }
    }

    public void setSixMonthPopulation(int smp)
    {
        if (smp < 1)
        {
            sixMonthPopulation = 0;
        } 
        else 
        {
            sixMonthPopulation = smp;
        }
    }

    public double calculateGrowthRate()
    {
        double change = sixMonthPopulation - initialPopulation;
        return (change / initialPopulation);
    }

    public int calculate12MonthPopulation()
    {
        double cgr = calculateGrowthRate();
        
        return (int)(Math.ceil (sixMonthPopulation + sixMonthPopulation * cgr));
    }
}
