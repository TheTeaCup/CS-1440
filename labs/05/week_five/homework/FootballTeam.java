/**
 * FootballTeam Class.
 *
 * @author Hunter.Wilson
 * @version 09.26.2023
 */

public class FootballTeam {
    private String teamName;
    private int numOfWins;
    private int numOfLosses;

    /**
     * Football Team constructor.
     * Takes in name as n.
     * Wins as w.
     * Losses as l.
     */
    public FootballTeam(String n, int w, int l) {
        teamName = n;
        numOfWins = w;
        numOfLosses = l;
    }

    // returns the teamName.
    public String getTeamName() {
        return teamName;
    }

    // returns the numOfWins.
    public int getNumOfWins() {
        return numOfWins;
    }

    // returns the numOfLosses.
    public int getNumOfLosses() {
        return numOfLosses;
    }

    // increases the wins.
    public void increaseWins() {
        numOfWins += 1;
    }

    // increases the losses.
    public void increaseLosses() {
        numOfLosses += 1;
    }

    // returns t/f if the team has more wins.
    public boolean getRecord() {
        if (numOfWins > numOfLosses)
            return true;
        else
            return false;
    }
}
