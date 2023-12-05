import java.util.Scanner;
import java.io.IOException;
import java.io.File;

/**
 * WeatherMonth Class.
 * Builds the Weather for a month.
 * @author Hunter Wilson
 * @version 11.20.2023
 */
public class WeatherMonth
{
    private int[] maxTemperature;
    private String monthName;
    private int daysInMonth;
    private int[] minTemperature;

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

        this.minTemperature = new int[this.daysInMonth];
        for (int i = 0; i < this.daysInMonth; i++)
        {
            this.minTemperature[i] = -999;
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

        this.minTemperature = new int[daysInMonth];
        for (int i = 0; i < this.daysInMonth; i++) 
        {
            this.minTemperature[i] = -999;
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
     * setMaxTemperature.
     * @param temperature int[]
     */
    public void setMaxTemperature(int[] temperature)
    {
        this.maxTemperature = temperature;
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
     * setMonthName.
     * @param monthName String
     */
    public void setMonthName(String monthName)
    {
        this.monthName = monthName;
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
        System.out.println("Day\tMax\tMin");

        for (int day = 1; day <= daysInMonth; day++)
        {
            System.out.println(day + "\t" + maxTemperature[day - 1] 
                                    + "\t" + minTemperature[day - 1]);
        }
    }

    /**
     * readMaxTempFile.
     * @param filename String
     * @throws IOException throws it
     */
    public void readMaxTempFile(String filename) throws IOException
    {
        File file = new File(filename);
        Scanner weatherData = new Scanner(file);

        while (weatherData.hasNext())
        {
            int n = weatherData.nextInt();
            int t = weatherData.nextInt();
            setDayMaxTemp(n, t);
        }

        weatherData.close();
    }

    /**
     * toString.
     * @return String
     */
    public String toString()
    {
        StringBuilder result = new StringBuilder(monthName 
                                                + "\nDay      Max       Min\n");

        for (int day = 0; day < daysInMonth; day++) 
        {
            result.append(String.format("%2d%10s%10s\n",
                    day + 1,
                    maxTemperature[day] == -999 ? "N/A" 
                    : String.valueOf(maxTemperature[day]),
                    minTemperature[day] == -999 ? "N/A" 
                    : String.valueOf(minTemperature[day])));
        }

        return result.toString();
    }

    /**
     * getMinTemperature.
     * @return minTemperature
     */
    public int[] getMinTemperature()
    {
        return this.minTemperature;
    }

    /**
     * setMinTemperature.
     * @param minTemperature int[]
     */
    public void setMinTemperature(int[] minTemperature)
    {
        this.minTemperature = minTemperature;
    }

    /**
     * setDayMinTemp.
     * @param dayOfMonth int
     * @param temperature int
     */
    public void setDayMinTemp(int dayOfMonth, int temperature)
    {
        if (dayOfMonth < 1 || dayOfMonth > daysInMonth) 
        {
            return;
        }
        minTemperature[dayOfMonth - 1] = temperature;
    }

    /**
     * readMinTempFile.
     * @param filename String
     * @throws IOException throws it
     */
    public void readMinTempFile(String filename) throws IOException 
    {
        File file = new File(filename);
        Scanner weatherData = new Scanner(file);

        while (weatherData.hasNext()) 
        {
            int n = weatherData.nextInt();
            int t = weatherData.nextInt();
            setDayMinTemp(n, t);
        }

        weatherData.close();
    }
}
