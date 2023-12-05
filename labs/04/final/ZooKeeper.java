
public class ZooKeeper
{
    private String lastName;
    private String firstName;
    private String specialty;

    public ZooKeeper(String lastName, String firstName,
                     String specialty)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.specialty = specialty;
    }

    public ZooKeeper(ZooKeeper zooKeeper)
    {
        this.lastName = zooKeeper.getLastName();
        this.firstName = zooKeeper.getFirstName();
        this.specialty = zooKeeper.getSpecialty();
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getSpecialty()
    {
        return this.specialty;
    }

    public void set(String lastName, String firstName,
                    String specialty)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.specialty = specialty;
    }

    public String toString()
    {
        return String.format("last name: %s, first name: %s, specialty: %s",
                this.lastName,
                this.firstName,
                this.specialty
        );
    }
}
