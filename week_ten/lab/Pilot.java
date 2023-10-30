
public class Pilot
{
    private String name;
    private String license;

    public Pilot()
    {
        this.name = "";
        this.license = "";
    }

    public Pilot(String name, String license)
    {
        this.name = name;
        this.license = license;
    }

    public String getName()
    {
        return name;
    }

    public String getLicense()
    {
        return license;
    }

    public void setName(String name)
    {
        if (name == null)
            this.name = "";
        else
            this.name = name;
    }

    public void setLicense(String license)
    {
        if (license == null)
            this.license = "";
        else
            this.license = license;
    }

    public Pilot copy()
    {
        Pilot pilot = new Pilot(name, license);

        return pilot;
    }

    public String toString()
    {
        return "Name: " + name + " - License: " + license;
    }

    public boolean equals(Pilot pilot)
    {
        return (this.name.equals(pilot.name)) &&
                (this.license.equals(pilot.license));
    }

}
