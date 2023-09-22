public class Demo {
    public static void main(String[] args) {
        System.out.println("Creating rectangle r...");
        Rectangle r = new Rectangle();
        System.out.println("\tLength: " + r.getLength());
        System.out.println("\tWidth: " + r.getWidth());
        System.out.println("\tArea: " + r.getArea());

        double len = 10;
        double wid = 20;
        System.out.println("Before set, len: " + len);
        r.set(len, wid);
        System.out.println("After set, len: " + len);

        System.out.println("\tLength: " + r.getLength());
        System.out.println("\tWidth: " + r.getWidth());
        System.out.println("\tArea: " + r.getArea());

        // Circle

        System.out.println("Creating Circle c...");
        Circle c = new Circle(5);

        System.out.println("\tRadius: " + c.getRadius());
        System.out.println("\tArea: " + c.getArea());
    }
}