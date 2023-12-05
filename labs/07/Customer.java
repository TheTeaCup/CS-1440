/**
 * Customer class.
 *
 * @author Hunter Wilson
 * @version 10.31.2023
 */

public class Customer {
    private String name;
    private String ssn;

    public Customer(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public Customer(Customer customer) {
        this.name = customer.getName();
        this.ssn = customer.getSsn();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null)
            this.name = "";
        else
            this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if (ssn == null)
            this.ssn = "";
        else
            this.ssn = ssn;
    }

    public String toString() {
        return String.format(
                "Name: %s - SSN: %s",
                name, ssn
        );
    }
}
