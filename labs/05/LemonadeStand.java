
/**
 * LemonadeStand Class.
 *
 * @author Hunter.Wilson
 * @version 10.03.2023
 */
public class LemonadeStand
{
    //Put instance variables below this line.

    private int lemons;
    private int gallonsOfWater;
    private int cupsOfSugar;
    private int emptyGlasses;
    private int glassesOfLemonade;
    private double price;
    private double income;

    /**
     * Default contrustor
     *
     */
    public LemonadeStand()
    {
        setLemons(0);
        setGallonsOfWater(0);
        setCupsOfSugar(0);
        setEmptyGlasses(0);
        setGlassesOfLemonade(0);
        setPrice(0);
        setIncome(0);
    }

    /**
     * LemonadeStand Constructor.
     *
     * @param initLemons A parameter
     * @param initgallonsOfWater A parameter
     * @param initcupsOfSugar A parameter
     * @param initemptyGlasses A parameter
     * @param initprice A parameter
     */
    public LemonadeStand(int initLemons,
                         int initGallonsOfWater,
                         int initCupsOfSugar,
                         int initEmptyGlasses,
                         double initPrice)
    {
        setLemons(initLemons);
        setGallonsOfWater(initGallonsOfWater);
        setCupsOfSugar(initCupsOfSugar);
        setEmptyGlasses(initEmptyGlasses);
        setGlassesOfLemonade(0);
        setPrice(initPrice);
        setIncome(0);
    }

    /**
     * Method getLemons.
     *
     * @return The return value
     */
    public int getLemons()
    {
        return lemons;
    }

    /**
     * Method getGallonsOfWater.
     *
     * @return The return value
     */
    public int getGallonsOfWater()
    {
        return gallonsOfWater;
    }

    /**
     * Method getCupsOfSugar.
     *
     * @return The return value
     */
    public int getCupsOfSugar()
    {
        return cupsOfSugar;
    }

    /**
     * Method getEmptyGlasses.
     *
     * @return The return value
     */
    public int getEmptyGlasses()
    {
        return emptyGlasses;
    }

    /**
     * Method getGlassesOfLemonade.
     *
     * @return The return value
     */
    public int getGlassesOfLemonade()
    {
        return glassesOfLemonade;
    }

    /**
     * Method getPrice.
     *
     * @return The return value
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Method getIncome.
     *
     * @return The return value
     */
    public double getIncome()
    {
        return income;
    }

    /**
     * Method setLemons.
     *
     * @param newLemons comes from input
     */
    public void setLemons(int newLemons)
    {
        if (newLemons < 0)
            lemons = 0;
        else
            lemons = newLemons;
    }

    /**
     * Method setGallonsOfWater.
     *
     * @param newGallonsOfWater comes from input
     */
    public void setGallonsOfWater(int newGallonsOfWater)
    {
        if (newGallonsOfWater < 0)
            gallonsOfWater = 0;
        else
            gallonsOfWater = newGallonsOfWater;
    }

    /**
     * Method setCupsOfSugar.
     *
     * @param newCupsOfSugar comes from input
     */
    public void setCupsOfSugar(int newCupsOfSugar)
    {
        if (newCupsOfSugar < 0)
            cupsOfSugar = 0;
        else
            cupsOfSugar = newCupsOfSugar;
    }

    /**
     * Method setEmptyGlasses.
     *
     * @param newEmptyGlasses comes from input
     */
    public void setEmptyGlasses(int newEmptyGlasses)
    {
        if (newEmptyGlasses < 0)
            emptyGlasses = 0;
        else
            emptyGlasses = newEmptyGlasses;
    }

    /**
     * Method setGlassesOfLemonade.
     *
     * @param newGlassesOfLemonade comes from input
     */
    public void setGlassesOfLemonade(int newGlassesOfLemonade)
    {
        if (newGlassesOfLemonade < 0)
            glassesOfLemonade = 0;
        else
            glassesOfLemonade = newGlassesOfLemonade;
    }

    /**
     * Method setPrice.
     *
     * @param newPrice comes from input
     */
    public void setPrice(double newPrice)
    {
        if (newPrice < 0)
            price = 0;
        else
            price = newPrice;
    }

    /**
     * Method setIncome.
     *
     * @param newIncome comes from input
     */
    public void setIncome(double newIncome)
    {
        if (newIncome < 0)
            income = 0;
        else
            income = newIncome;
    }

    /**
     * Method makeLemonade.
     *
     * @return 0 or 8
     */

    public int makeLemonade()
    {
        if (lemons >= 6 && gallonsOfWater >= 1
                && cupsOfSugar >= 1 && emptyGlasses >= 8)
        {
            lemons -= 6;
            gallonsOfWater -= 1;
            cupsOfSugar -= 1;
            emptyGlasses -= 8;
            glassesOfLemonade += 8;
            return 8;
        }
        else
        {
            return 0;
        }
    }

    /**
     * Method sellLemonade.
     *
     * @return 1
     */

    public int sellLemonade()
    {
        if (glassesOfLemonade <= 0)
        {

            if (makeLemonade() == 0)
            {
                return 0;

            }
            else
            {
                glassesOfLemonade -= 1;
                income = income + price;
            }
        }
        else
        {
            glassesOfLemonade -= 1;
            income = income + price;
        }
        return 1;
    }

    /**
     * Method sellMoreLemonade.
     *
     * @param requestedGlasses get from inout
     * @return glassesSold
     */

    public int sellMoreLemonade(int requestedGlasses)
    {

        if (requestedGlasses > 8)
        {
            requestedGlasses = 8;
        }
        int i = 0;
        for (; i < requestedGlasses; i++)
        {
            if (sellLemonade() == 0)
            {
                break;
            }
        }
        return i;

    }

    /**
     * Main method.
     *
     * @param args command-line not used
     */
    public static void main(String[] args)
    {
        LemonadeStand lemonadeStand = new LemonadeStand(15, 3, 4, 20, 1.5);
        lemonadeStand.makeLemonade();
        System.out.println(lemonadeStand.getLemons());
        System.out.println(lemonadeStand.getGallonsOfWater());
        System.out.println(lemonadeStand.getCupsOfSugar());
        System.out.println(lemonadeStand.getGlassesOfLemonade());

        lemonadeStand.sellLemonade();
        lemonadeStand.sellLemonade();
        lemonadeStand.sellLemonade();

        System.out.println(lemonadeStand.getLemons());
        System.out.println(lemonadeStand.getGallonsOfWater());
        System.out.println(lemonadeStand.getCupsOfSugar());
        System.out.println(lemonadeStand.getGlassesOfLemonade());
    }
}
