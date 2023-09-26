public class FootballTeam
{
    private String teamName;
    private int numOfWins;
    private int numOfLosses;

    public FootballTeam(String n, int w, int l)
    {
        teamName = n;
        numOfWins = w;
        numOfLosses = l;
    }

    public String getName()
    {
        return teamName;
    }

    public int getNumOfWins()
    {
        return numOfWins;
    }

    public int getNumOfLosses()
    {
        return numOfLosses;
    }
}
