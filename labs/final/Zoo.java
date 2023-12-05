
public class Zoo
{
    private String zooName;
    private ZooKeeper zooKeeper;
    private String animal;
    private int[] visits;

    public Zoo(String zooName, ZooKeeper zooKeeper,
               String animal)
    {
        this.zooName = zooName;
        this.zooKeeper = zooKeeper;
        this.animal = animal;
    }

    public String getZooName()
    {
        return this.zooName;
    }

    public ZooKeeper getZooKeeper()
    {
        return new ZooKeeper(this.zooKeeper);
    }

    public String getAnimal()
    {
        return this.animal;
    }

    public String toString()
    {
        return String.format("%s, %s, %s",
                this.zooName,
                this.animal,
                this.zooKeeper.toString()
        );
    }

    public void setVisits(int[] visits)
    {
        this.visits = visits;
    }

    public int getMinimum()
    {
        int min = Integer.MAX_VALUE;

        for (int visit : visits)
        {
            if (visit < min)
            {
                min = visit;
            }
        }

        return min;
    }

    public int getMaximum()
    {
        int max = Integer.MIN_VALUE;

        for (int visit : visits)
        {
            if (visit > max)
            {
                max = visit;
            }
        }

        return max;
    }

    public double getAverage()
    {
        double sum = 0;
        int count = 0;

        for (int visit : visits)
        {
            sum += visit;
            count++;
        }

        if (count == 0)
        {
            return 0;
        }

        return sum / count;
    }
}
