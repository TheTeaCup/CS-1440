/**
 * Flight class.
 *
 * @author Hunter Wilson
 * @version 10.31.2023
 */

public class Flight {
    private int flightNumber;
    private String destination;
    private Pilot pilot;
    private String date;

    public Flight() {
        this.flightNumber = 0;
        this.destination = "";
        this.pilot = new Pilot();
        this.date = "";
    }

    /**
     * Flight mutator.
     *
     * @param flightNumber, destination, pilot, date.
     */

    public Flight(int flightNumber, String destination,
                  Pilot pilot, String date) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.pilot = pilot.copy();
        this.date = date;
    }

    /**
     * getFlightNumber.
     * return flightNumber;
     */
    public int getFlightNumber() {
        return this.flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * getDestination.
     * return destination;
     */
    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * getPilot.
     * return pilot.copy;
     */
    public Pilot getPilot() {
        return this.pilot.copy();
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot.copy();
    }

    /**
     * getDate.
     * return date;
     */
    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String toString() {
        return String.format("Flt#: %s\tDest: %s\t"
                        + "Plt: %s\tDate: %s",
                flightNumber, destination, pilot.getName(), date
        );
    }

    public Flight copy() {
        Flight flight = new Flight(flightNumber, destination,
                pilot, date);

        return flight;
    }
}
