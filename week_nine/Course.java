
public class Course
{
    // [access] [variable] : [type]
    // [access] [type] [variable];
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;
    
    public Course(String name, Instructor instr, Textbook text)
    {
        courseName = name;
        instructor = instr;
        textbook = text;
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    
    public Instructor getInstructor()
    {
        return instructor;
    }
    
    public Textbook getTextbook()
    {
        return textbook;
    }
    
    public String toString()
    {
        String str = String.format(
            "%s\n%s\n%s", 
            courseName, instructor.toString(),
            textbook.toString()  
        );
        
        return str;
    }
}
