
/**
 * WeatherMonth Class.
 * Builds the Weather for a month.
 * @author Hunter Wilson
 * @version 11.20.2023
 */
public class WeatherComputation
{
    public static double averageTemperature(int[] temperature)
    {
        double sum = 0;
        int count = 0;
        for (int temp : temperature)
        {
            if (temp != -999)
            {
                sum += temp;
                count++;
            }
        }
        if (count == 0)
        {
            return 0;
        }
        return sum / count;
    }

    public static int highestTemperature(int[] temperatures)
    {
        int highest = Integer.MIN_VALUE;
        for (int temp : temperatures)
        {
            if (temp != -999 && temp > highest)
            {
                highest = temp;
            }
        }
        return highest;
    }

    public static int lowestTemperature(int[] temperatures)
    {
        int lowest = Integer.MAX_VALUE;
        for (int temp : temperatures)
        {
            if (temp != -999 && temp < lowest)
            {
                lowest = temp;
            }
        }
        return lowest;
    }

    public static int numberMissing(int[] temperature)
    {
        int count = 0;
        for (int temp : temperature)
        {
            if (temp == -999)
            {
                count++;
            }
        }
        return count;
    }

    public static double hdd(int max, int min)
    {
        if (max == -999 || min == -999 || max < min)
        {
            return 0.0;
        }

        double avgTemp = (max + min) / 2.0;

        if (avgTemp < 65.0)
        {
            return 65.0 - avgTemp;
        }
        else
        {
            return 0.0;
        }
    }

    public static double cdd(int max, int min)
    {
        if (max == -999 || min == -999 || max < min)
        {
            return 0.0;
        }

        double avgTemp = (max + min) / 2.0;

        if (avgTemp > 65.0)
        {
            return avgTemp - 65.0;
        }
        else
        {
            return 0.0;
        }
    }

    public static double monthHdd(int[] maxTemperature, int[] minTemperature) {
        double totalHdd = 0.0;

        for (int i = 0; i < maxTemperature.length; i++)
        {
            totalHdd += hdd(maxTemperature[i], minTemperature[i]);
        }

        return totalHdd;
    }

    public static double monthCdd(int[] maxTemperature, int[] minTemperature) {
        double totalCdd = 0.0;

        for (int i = 0; i < maxTemperature.length; i++)
        {
            totalCdd += cdd(maxTemperature[i], minTemperature[i]);
        }

        return totalCdd;
    }

    public static void main(String[] args)
    {
        int[] test_array = {30,10,-999,20,40,-999,50};
        System.out.print(averageTemperature(test_array) + ", ");
        System.out.print(highestTemperature(test_array) + ", ");
        System.out.print(lowestTemperature(test_array) + ", ");
        System.out.print(numberMissing(test_array));
    }
}
