import java.util.Scanner;

public class DataPoint
{
    private static int numDataPoints = 0;
    
    private String date;
    private int low;
    private int high;
    
    public DataPoint(String d, int l, int h)
    {
        date = d;
        low = l;
        high = h;
        numDataPoints++;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public int getLow()
    {
        return low;
    }
    
    public int getHigh()
    {
        return high;
    }
    
    public static DataPoint createDataPoint()
    {
        // get input from user for each field
        // create a DataPoint object
        // return DataPoint object
        Scanner kb = new Scanner(System.in);
        System.out.print("Date: ");
        String date = kb.nextLine();
        
        System.out.print("Low: ");
        int low = kb.nextInt();
        
        System.out.print("High: ");
        int high = kb.nextInt();
        
        DataPoint d = new DataPoint(date, low, high);
        System.out.println("DataPoint created!");
        return d;
    }
    
    // toString method represent DataPoint instance
    // as a String
    public String toString()
    {
        String str = String.format("%s  %d  %d",
            getDate(), getLow(), getHigh());
        return str;
    }
}






