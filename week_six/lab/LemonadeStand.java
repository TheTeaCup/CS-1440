
/**
 * Short, one-line description of LemonadeStand class here.
 *
 * Optionally, include a paragraph that provides a more
 * detailed description.
 *
 * @author (your name)
 * @version (a version number or a date)
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
     *
     */
    public LemonadeStand()
    {

    }

    public LemonadeStand(int initLemons, int initGallonsOfWater, int initCupsOfSugar,
                         int initEmptyGlasses, double initPrice)
    {

    }

    public int getLemons()
    {
        return lemons;
    }

    public int getGallonsOfWater()
    {
        return gallonsOfWater;
    }

    public int getCupsOfSugar()
    {
        return cupsOfSugar;
    }

    public int getEmptyGlasses()
    {
        return emptyGlasses;
    }

    public int getGlassesOfLemonade()
    {
        return glassesOfLemonade;
    }

    public double getPrice()
    {
        return price;
    }

    public double getIncome()
    {
        return income;
    }

    public void setLemons(int newLemons)
    {
        lemons = newLemons;
    }

    public void setGallonsOfWater(int newGallonsOfWater)
    {
        gallonsOfWater = newGallonsOfWater;
    }

    public void setCupsOfSugar(int newCupsOfSugar)
    {
        cupsOfSugar = newCupsOfSugar;
    }

    public void setEmptyGlasses(int newEmptyGlasses)
    {
        emptyGlasses = newEmptyGlasses;
    }

    public void setGlassesOfLemonade(int newGlassesOfLemonade)
    {
        glassesOfLemonade = newGlassesOfLemonade;
    }

    public void setPrice(double newPrice)
    {
        price = newPrice;
    }

    public void setIncome(double newIncome)
    {
        income = newIncome;
    }

    public int makeLemonade()
    {
        return 1;
    }

    public int sellLemonade()
    {
        return 1;
    }

    public int sellMoreLemonade(int requestedGlasses)
    {
        return 1;
    }

}
