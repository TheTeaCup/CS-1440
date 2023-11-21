
/**
 * WeatherComputation.java
 */

//Put any imports below this line.

/**
 * Static methods library which compute averages and other
 * computations on integer arrays of temperatures.
 * 
 * @author Joel Swanson 
 * @version 03.29.2014
 */
public class WeatherComputation
{    
    /**
     * Average an array of temperatures.
     * @param temperatures An array storing temperatures as ints.
     * @return Returns the average of the array of ints.
     */
    public static double averageTemperature(int[] temperatures)
    {   
        double sum = 0;
        int count = 0;
        
        for (int temp : temperatures)
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

    /**
     * Find the highest in an array of temperatures.
     * @param temperatures An array storing temperatures as ints.
     * @return The largest value from the the array of ints.
     */
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

    /**
     * Find the lowest in an array of temperatures.
     * @param temperatures An array storing temperatures as ints.
     * @return The lowest value from the the array of ints.
     */
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

    /**
     * Return the total number of missing days.  That is days with
     * -999 recorded as the temperatures.
     * @param temperatures An array storing temperatures as ints.
     * @return The number of -999s found.
     */
    public static int numberMissing(int[] temperatures)
    {       
        int count = 0;
        for (int temp : temperatures)
        {
            if (temp == -999)
            {
                count++;
            }
        }
        return count;
    } 

    /**
     * Calculate heating degree day.
     * @param max The highest temperature for a given day.
     * @param min The lowest temperature for a given day.
     * @return heating degree day data for this day.
     */
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

    /**
     * Calculate cooling degree day.
     * @param max The highest temperature for a given day.
     * @param min The lowest temperature for a given day.
     * @return cooling degree day data for this day.
     */
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

    /**
     * Sum monthly heating degree days.
     * @param max An array with the highest temperatures for each day
     * in a given month.
     * @param min An array with the lowest temperatures for each day
     * in a given month.
     * @return The sum of the heating degree days.
     */
    public static double monthHdd(int[] max, int[] min)
    {
        double totalHdd = 0.0;

        for (int i = 0; i < max.length; i++)
        {
            totalHdd += hdd(max[i], min[i]);
        }

        return totalHdd;   
    }

    /**
     * Sum monthly cooling degree days.
     * @param max An array with the highest temperatures for each day
     * in a given month.
     * @param min An array with the lowest temperatures for each day
     * in a given month.
     * @return The sum of the cooling degree days.
     */
    public static double monthCdd(int[] max, int[] min)
    {
        double totalCdd = 0.0;

        for (int i = 0; i < max.length; i++)
        {
            totalCdd += cdd(max[i], min[i]);
        }

        return totalCdd;       
    }    

    /**
     * @param args not used
     */
    public static void main(String[] args)
    {
        int[] testArray = {20, -999, 10, 50, -999, 40, 30};
        System.out.print(averageTemperature(testArray) + ", ");
        System.out.print(highestTemperature(testArray) + ", ");
        System.out.print(lowestTemperature(testArray) + ", ");
        System.out.print(numberMissing(testArray));
    }
}
