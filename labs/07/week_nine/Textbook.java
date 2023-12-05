public class Textbook
{
    private String title,
    author,
    publisher;

    public Textbook(String t, String a, String p)
    {
        set(t, a, p);
    }

    public void set(String t, String a, String p)
    {
        title = t;
        author = a;
        publisher = p;
    }

    public String toString()
    {
        return String.format("%s\n%s\n%s",
            title, author, publisher);
    }
}