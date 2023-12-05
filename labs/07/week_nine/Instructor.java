public class Instructor
{
    private String lastName,
    firstName,
    officeNumber;

    public Instructor(String l, String f, String o)
    {
        set(l, f, o);
    }

    public void set(String l, String f, String o)
    {
        lastName = l;
        firstName = f;
        officeNumber = o;
    }

    public String toString()
    {
        return String.format("%s\n%s\n%s",
            lastName, firstName, officeNumber);
    }
}