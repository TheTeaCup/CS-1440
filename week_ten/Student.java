public class Student {
    private String id;
    private String name;
    private StudentYear year;

    public Student(String id, String name, StudentYear year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        year = StudentYear.FRESHMAN;
    }

    public StudentYear getYear() {
        return year;
    }

    public String toString() {
        return String.format(
                "%s, %s, %s",
                id, name, year
        );
    }


}
