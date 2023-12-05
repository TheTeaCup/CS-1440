/**
 * Ticket class.
 *
 * @author Hunter Wilson
 * @version 10.31.2023
 */

public class Ticket {
    private Customer customer;
    private Flight flight;

    public Ticket(Customer customer, Flight flight) {
        this.customer = new Customer(customer);
        this.flight = flight.copy();
    }

    public Customer getCustomer() {
        return new Customer(this.customer);
    }

    public void setCustomer(Customer customer) {
        this.customer = new Customer(customer);
    }

    public Flight getFlight() {
        return flight.copy();
    }

    public void setFlight(Flight flight) {
        this.flight = flight.copy();
    }

    public String toString() {
        return String.format(
                "******** TICKET ********\n"
                        + "* Name: %s\n"
                        + "* SSN: %s\n"
                        + "* Flight: %s\n"
                        + "* Date: %s\n"
                        + "* Destination: %s\n"
                        + "************************",
                customer.getName(),
                customer.getSsn(),
                flight.getFlightNumber(),
                flight.getDate(),
                flight.getDestination()
        );
    }

}
