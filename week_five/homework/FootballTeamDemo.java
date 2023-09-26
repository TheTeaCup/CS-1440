/**
 * FootballTeamDemo Class.
 *
 * @author Hunter.Wilson
 * @version 09.26.2023
 */

public class FootballTeamDemo {
    /**
     * Main statement.
     *
     * @param args taken but not used.
     */
    public static void main(String[] args) {
        // Create a new FootballTeam instance
        FootballTeam FB =
                new FootballTeam("Mountaineers", 3, 5);

        // Print out if they have a good record
        System.out.println(FB.getRecord());

        // Increate the teams win 3x by 1 point
        FB.increaseWins();
        FB.increaseWins();
        FB.increaseWins();

        // Print out if they have a good record
        System.out.println(FB.getRecord());

    }
}
