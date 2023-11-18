
/**
 * WeatherMonth Class.
 * Builds the Weather for a month.
 * @author Hunter Wilson
 * @version 11.17.2023
 */
public class WeatherMonth
{
    private int[] maxTemperature;
    private String monthName;
    private int daysInMonth;

    /**
     * WeatherMonth no-arg constructor.
     */
    public WeatherMonth()
    {
        this.monthName = "January";
        this.daysInMonth = 31;
        this.maxTemperature = new int[this.daysInMonth];

        for (int i = 0; i < this.daysInMonth; i++)
        {
            this.maxTemperature[i] = -999;
        }
    }

    /**
     * WeatherMonth mutator.
     * @param monthName String
     * @param daysInMonth int
     */
    public WeatherMonth(String monthName, int daysInMonth)
    {
        this.monthName = monthName;
        this.daysInMonth = daysInMonth;
        this.maxTemperature = new int[daysInMonth];
        for (int i = 0; i < this.daysInMonth; i++)
        {
            this.maxTemperature[i] = -999;
        }
    }

    /**
     * getMaxTemperature.
     * @return maxTemperature
     */
    public int[] getMaxTemperature()
    {
        return this.maxTemperature;
    }

    /**
     * getMonthName.
     * @return monthName
     */
    public String getMonthName()
    {
        return this.monthName;
    }

    /**
     * getDaysInMonth.
     * @return daysInMonth
     */
    public int getDaysInMonth()
    {
        return this.daysInMonth;
    }

    /**
     * setMaxTemperature.
     * @param temperature int[]
     */
    public void setMaxTemperature(int[] temperature)
    {
        this.maxTemperature = temperature;
    }

    /**
     * setMonthName.
     * @param monthName String
     */
    public void setMonthName(String monthName)
    {
        this.monthName = monthName;
    }

    /**
     * setDaysInMonth.
     * @param daysInMonth int
     */
    public void setDaysInMonth(int daysInMonth)
    {
        this.daysInMonth = daysInMonth;
    }

    /**
     * setDayMaxTemp.
     * @param dayOfMonth int
     * @param temperature int
     */
    public void setDayMaxTemp(int dayOfMonth, int temperature)
    {
        if (dayOfMonth < 1 || dayOfMonth > daysInMonth)
        {
            return;
        }

        maxTemperature[dayOfMonth - 1] = temperature;
    }

    /**
     * displayWeatherMonth.
     * Prints out:
     * Month
     * Day  Max
     * 1    1
     */
    public void displayWeatherMonth()
    {
        System.out.println(monthName);
        System.out.println("Day\tMax");

        for (int day = 1; day <= daysInMonth; day++)
        {
            System.out.println(day + "\t" + maxTemperature[day - 1]);
        }
    }

    /**
     * readMaxTempFile.
     * @param filename String
     */
    public void readMaxTempFile(String filename)
    {

    }

    /**
     * toString.
     * @return String
     */
    public String toString()
    {
        return "";
    }
}
