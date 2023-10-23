
public class Demo
{
    public static void main(String[] args)
    {
        String name = "CS I";
        Instructor instr = new Instructor(
            "McCann", "Shane", "312E"
        );
        
        Textbook text = new Textbook(
            "Starting w/ Java", "Gaddis", "idk"
        );
        
        Course c = new Course(name, instr, text);
        System.out.println(c);
        
        Textbook book = c.getTextbook();
        book.set("title", "author", "id");
        System.out.println("\n" + c);
        
    }
}
